package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class MostShoppingCustomersPages {

  WebDriver driver;
  public MostShoppingCustomersPages(WebDriver driver) {
    this.driver = driver;
  }
  By mostShoppingCustomersSection = By.id("doc-most_shopping_customers");
  By titleMostShoppingCustomersPage = By.xpath("//h1[contains(text(),'Most Shopping Customers')]");

  public void clickMostShoppingCustomersSection () {
    driver.findElement(mostShoppingCustomersSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleMostShoppingCustomersPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
