package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ShippingModulesPages {

  WebDriver driver;

  public ShippingModulesPages(WebDriver driver) {
    this.driver = driver;
  }

  By shippingModulesSection = By.id("doc-shipping");
  By titleShippingModulesPage = By.xpath("//h1[contains(text(),'Shipping Modules')]");

  public ShippingModulesPages clickShippingSection() {
    driver.findElement(shippingModulesSection).click();
    return this;
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleShippingModulesPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
