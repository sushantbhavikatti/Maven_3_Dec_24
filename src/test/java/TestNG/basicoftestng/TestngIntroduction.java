package TestNG.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestngIntroduction {

    public static WebDriver driver;

    public void preRequsite() {
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void edsoServices() {
        driver.get("https://edso.in/");
        driver.close();
    }

    @Test
    public void tataConsultancy() {
        driver.get("https://tcs.com/");
        driver.close();
    }

    @AfterMethod
    public void closedBrowser() {
        driver.close();

    }
}


