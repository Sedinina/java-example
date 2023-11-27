package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CatalogPage {

  WebDriver driver;

  public CatalogPage(WebDriver driver) {
    this.driver = driver;
  }

  By catalogSection = By.id("doc-catalog");
  By titleCatalogPage = By.xpath("//h1[contains(text(),'Catalog')]");

  public void clickCatalogSection() {
    driver.findElement(catalogSection).click();
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleCatalogPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
