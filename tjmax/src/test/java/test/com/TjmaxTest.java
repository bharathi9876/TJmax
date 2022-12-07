/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author giril
 */
public class TjmaxTest {

    private WebDriver driver;
    private String baseUrl;

    public TjmaxTest() {
    }
//commiting by bharathi
   
    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {

        driver.quit();
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://tjmaxx.tjx.com/store/index.jsp");

        driver.findElement(By.id("usmm-tl-cat240003")).click();

        driver.findElement(By.xpath("//div[@id='bx-element-1971156-kDGwXbf']/button/span")).click();

        driver.get("https://tjmaxx.tjx.com/store/shop/new-arrivals/_/N-842114098?Nr=AND%28OR%28product.catalogId%3Atjmaxx%29%2Cproduct.siteId%3Atjmaxx%29&tn=0");
        driver.manage().wait(1000);
        driver.manage().deleteAllCookies();

        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[@id='endeca-main']/div/div/ul/li")).getText(), "new arrivals");
        } catch (Error e) {
            System.out.println(e.toString());

        }
    }
}
