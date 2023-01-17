package day13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04_StaleElementReferenceException extends TestBase {

    /*
    StateElementReferenceException
        StateElementReferenceException = eski kullanılamaz durumda olan, kullanıma artık elverişli olmayan durumlarda alınan hatadır.
        Sayfayı yenilediğimizde,
        sayfada ileri geri gittiğimizde meydana gelen exception'dır.

            Çözüm
        Elemanı tekrar bulmak.

 */

    @Test
    public void staleElementReferenceExceptionTest1(){
        driver.get("hhtps://www.techproeducation.com");

        //LMS LOGIN linkine tikla ve o sayfanin URL inin LMS  icerdigini test et
        WebElement lmsLoginLink = driver.findElement(By.linkText("LMS LOGIN"));
        waitFor(5);
        lmsLoginLink.click(); //LMS e git
        Assert.assertTrue(driver.getCurrentUrl().contains("lms")); //URL in lms kelimesini icerdigini test et
        waitFor(5);

        //Tekrar ana sayfaya gel ve LMS LOGIN sayfasina tekrar git.
        driver.navigate().back();
        waitFor(5);
        lmsLoginLink.click(); //LMS e git
        /*
        lmsLoginLink linkini sayfa yenilendikten(back()) sonra kullandigim icin StaleElementReferenceException aldim
         */
    }

    @Test
    public void staleElementReferenceExceptionTest2(){
        driver.get("https://www.techproeducation.com");
        waitFor(5);
        WebElement lmsLoginLink = driver.findElement(By.linkText("LMS LOGIN"));
        waitFor(5);
        driver.navigate().refresh();
        waitFor(5);
        lmsLoginLink.click(); //SAYFA YENILENMEDEN ONCE BULDUGUM ELEMENTI, SAYFA YENILENDIKTEN SONRA KULLANMAK ISTEDIM

        lmsLoginLink.click();// org.openqa.selenium.StaleElementReferenceException

//        COZUM ESKI(SLATE ELEMENT) ELEMENTI TEKRAR LOCATE ET
//        driver.findElement(By.linkText("LMS LOGIN")).click();


        /*
            WebDriverException
        Driver versiyonlari ve browser versiyonlari ayni veya yakin olmadiginda alinir.
        Driver'i(Browser) kapattiktan sonra tekrar kullanmak istediginiz durumlarda alinabilir.
            SOLUTION
        Framework dizayninin guzel kurulmus olmasi gerekir. Ornegin Driver class'inda birden fazla driver.quit() olmamali.
 */

    }
}
