package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
    WebDriver driver;
    public AddToCart(WebDriver driver){ this.driver=driver;}
    //Locators
    private By item1= By.id("add-to-cart-sauce-labs-backpack");
    private By item2= By.id("add-to-cart-sauce-labs-bike-light");
    //Action

    public void AddItems(){
        driver.findElement(item1).click();
        driver.findElement(item2).click();
    }
}
