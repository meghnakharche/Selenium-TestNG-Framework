package tests;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.Checkout;
import pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    WebDriver driver;
    LoginPage loginpage;
    AddToCart addtocart;
    Checkout checkout;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }

    @Test
    public void MainTest() {
        loginpage = new LoginPage(driver);
        loginpage.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Login successful!");
        addtocart= new AddToCart(driver);
        addtocart.AddItems();
        checkout= new Checkout(driver);
        checkout.Checkout_cart();
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-complete.html"));

    }

   @AfterClass
   public void tearDown() {
       driver.quit();
    }
}
