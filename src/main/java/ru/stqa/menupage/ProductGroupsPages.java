package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ProductGroupsPages {

  WebDriver driver;

  public ProductGroupsPages(WebDriver driver) {
    this.driver = driver;
  }

  By productGroupsSection = By.id("doc-product_groups");
  By titleProductGroupsPage = By.xpath("//h1[contains(text(),'Product Groups')]");

  public ProductGroupsPages clickProductGroupsSection() {
    driver.findElement(productGroupsSection).click();
    return this;
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleProductGroupsPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
