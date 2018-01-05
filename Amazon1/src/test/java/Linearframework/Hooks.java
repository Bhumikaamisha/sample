package Linearframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class Hooks {

        public static WebDriver driver;

        public static WebDriver getDriver()
        {
            return driver;
        }


        @BeforeClass
        public static  void openBrowser()
        {
            System.out.println("starting the browser");
            //System.setProperty("webdriver.gecko.driver", "C:\\jars\\geckodriver.exe");
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
            driver.get("https://www.amazon.co.uk/");
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//
        }

        @AfterClass
        public static void closeBrowser()
        {
            System.out.println("I am in closing");
            driver.quit();
        }
    }



