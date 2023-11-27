package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class StorageEncodingPages {

  WebDriver driver;
  public StorageEncodingPages(WebDriver driver) {
    this.driver = driver;
  }
  By storageSection = By.id("doc-storage_encoding");
  By titleStorageEncodingPage = By.xpath("//h1[contains(text(),'Storage Encoding')]");

  public void clickStorageEncodingSection () {
    driver.findElement(storageSection).click();
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleStorageEncodingPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
