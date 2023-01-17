package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class C02_TimeOutException extends TestBase {

    //TimeOutException:

    //Explicit wait kullanildiginda ve element bulunamadiginda alinir.
    //Explicit wait & yanlis locator -- timeout
    //Explicit wait & dogru locator & sure yeterli degil -> timeout
    //Explicit wait & dogru locator & sure yeterli & iframe var-> timeout

    //->SOLUTION:

    //-Sureyi arttırmak
    //-Farkli explicit wait visibilityOfElementLocated yerine presenceOfElementLocated. Ya da javascript executor da ki waiter
    //sayfa gecislerini beklemek icin kullanabilirim
    //-Locator i tekrar kontrol etmek
    //-Frameworkunde hazir reusable method lar var. Bu durumda timeoutexception aldigimda hizlica o metodlar yardımıyla problemi cozebiliyoruz.


    @Test
    public void timeOutExceptionTest(){
        driver.get("https://www.techproeducation.com");
//        Explit wait icin olusturdugumuz methodlardan birini kullanalim
//        Parametre 1: beklemek istedigim element, Parametre 2: Max sure


    }
}
