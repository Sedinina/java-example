package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class VQmodsPages {

  WebDriver driver;

  public VQmodsPages(WebDriver driver) {
    this.driver = driver;
  }

  By vQmodsSection = By.id("doc-vqmods");
  By titleVQmodsPage = By.xpath("//h1[contains(text(),'vQmods')]");

  public VQmodsPages clickVQmodsPage() {
    driver.findElement(vQmodsSection).click();
    return this;
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleVQmodsPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
