package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
    WebDriver driver;
    public Checkout(WebDriver driver){ this.driver=driver;}

    //Locators
    private By gotocart= By.className("shopping_cart_badge");
    private By checkout= By.xpath("//button[@id='checkout']");
    private By fname= By.xpath("//input[@id='first-name' and @name='firstName']");
    private By lname= By.xpath("//input[@id='last-name' and @name='lastName']");
    private By zip= By.xpath("//input[@id='postal-code' and @placeholder='Zip/Postal Code']");
    private By next= By.xpath("//input[@id='continue' and @value='Continue']");
    private By finish= By.xpath("//button[@id='finish' and text()='Finish']");

    //Action
    public void Checkout_cart(String firstname, String lastname,String zipcode){
        driver.findElement(gotocart).click();
        driver.findElement(checkout).click();
        driver.findElement(fname).sendKeys(firstname);
        driver.findElement(lname).sendKeys(lastname);
        driver.findElement(zip).sendKeys(zipcode);
        driver.findElement(next).click();
        driver.findElement(finish).click();

    }

}
