package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
    WebDriver driver;
    public Checkout(WebDriver driver){ this.driver=driver;}

    //Locators
    private By gotocart= By.className("shopping_cart_badge");
    private By checkout= By.xpath("//button[@id='checkout']");
    private By firstname= By.xpath("//input[@id='first-name' and @name='firstName']");
    private By lastname= By.xpath("//input[@id='last-name' and @name='lastName']");
    private By zipcode= By.xpath("//input[@id='postal-code' and @placeholder='Zip/Postal Code']");
    private By next= By.xpath("//input[@id='continue' and @value='Continue']");
    private By finish= By.xpath("//button[@id='finish' and text()='Finish']");

    //Action
    public void Checkout_cart(){
        driver.findElement(gotocart).click();
        driver.findElement(checkout).click();
        driver.findElement(firstname).sendKeys("Johny");
        driver.findElement(lastname).sendKeys("Dude");
        driver.findElement(zipcode).sendKeys("450020");
        driver.findElement(next).click();
        driver.findElement(finish).click();

    }

}
