package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BeforeClassAfterClass {
    /*
       @BeforeClass ve @AfterClass notasyonlari sadece static method'lar icin calisir.
       @BeforeClass ve @AfterClass kullanirsak olusturdugumuz @Test method'larinin hepsini ayni anda calistirip
       en son @AfterClass'i calistiririz.
       Ama sadece @Before ve @After kullanirsak her test icin @Before ve @After'i kullanir.
     */
    @BeforeClass
    public static void setUp(){
        System.out.println("Bütün Testlerden once calisti");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("Bütün Testlerden sonra çalıştı");
    }
    @Test
    public void test01(){
        System.out.println("Ilk Test");
    }
    @Test
    public void test02(){
        System.out.println("Ikıncı Test");
    }
    @Test
    @Ignore
    public void test03(){
        System.out.println("Üçüncü Test");
    }
}
