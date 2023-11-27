package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class MostSoldProductsPages {

  WebDriver driver;
  public MostSoldProductsPages(WebDriver driver) {
    this.driver = driver;
  }
  By mostSoldProductsSection = By.id("doc-most_sold_products");
  By titleTemplatePage = By.xpath("//h1[contains(text(),'Most Sold Products')]");

  public void clickMostSoldProductsSection () {
    driver.findElement(mostSoldProductsSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleTemplatePage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
