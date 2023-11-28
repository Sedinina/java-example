package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class QuantityUnitsPages {

  WebDriver driver;
  public QuantityUnitsPages(WebDriver driver) {
    this.driver = driver;
  }
  By quantityUnitsSection = By.id("doc-quantity_units");
  By titleQuantityUnitsPage = By.xpath("//h1[contains(text(),'Quantity Units')]");

  public QuantityUnitsPages clickTQuantityUnitsSection () {
    driver.findElement(quantityUnitsSection).click();
    return this;
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleQuantityUnitsPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
