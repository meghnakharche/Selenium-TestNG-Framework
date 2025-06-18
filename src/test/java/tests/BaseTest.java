package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ConfigReader;

import java.util.Properties;

public class BaseTest {
WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Properties prop = ConfigReader.readpropertie();
        driver.get(prop.getProperty("url"));

    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
