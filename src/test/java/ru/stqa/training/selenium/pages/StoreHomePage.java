package ru.stqa.training.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StoreHomePage extends Page {

  public StoreHomePage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }


  public StoreHomePage openStoreHomePage() {
    driver.get("http://localhost/litecart/en/");
    return this;
  }


  public StoreHomePage listProductMostPopular(int i) {
    WebElement allProduct = driver.findElement(By.id("box-most-popular"));
    List<WebElement> product = allProduct.findElements(By.cssSelector("li[class*=product]"));
    product.get(i).click();
    return this;
  }

}
