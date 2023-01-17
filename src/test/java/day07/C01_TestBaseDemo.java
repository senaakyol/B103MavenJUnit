package day07;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class C01_TestBaseDemo extends TestBase {
    /*
    UTILITIES:
    -Utilities tekrar tekrar kullanacagimiz classlari koydugumuz paketin adidir.
        -TestBase
        -Driver
        -ExcelUtil
        -Configuration

     -Utilities paketinde Test Case ler yazilmaz
     -Sadece tekrar kullanilabilecek destek siniflari(support class) olusturulur.
     -Bu support classlar test caselerin yazilmasini hizlandirir
     */

    @Test
    public void test1(){
        //Techproeducation anasayfasına git ve title in Bootcamps kelimesini icerdigini test edelim

        driver.get("https://www.techproeducation.com");

        // ve title in 'Bootcamps' kelimesini icerdigini test edelim
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Bootcamps"));
    }


}
