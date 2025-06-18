package tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.Checkout;
import pages.LoginPage;
import utils.ConfigReader;

import java.util.Properties;

public class LoginTest extends BaseTest {
    LoginPage loginpage;
    AddToCart addtocart;
    Checkout checkout;

    @Test
    public void MainTest() {
        Properties prop = ConfigReader.readpropertie();
        String user = prop.getProperty("username");
        String pass = prop.getProperty("password");
        loginpage = new LoginPage(driver);
        loginpage.login(user, pass);
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Login successful!");
        addtocart= new AddToCart(driver);
        addtocart.AddItems();
        checkout= new Checkout(driver);
        checkout.Checkout_cart("firstname","lastname","zipcode");
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-complete.html"));

    }
}
