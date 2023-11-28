package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SlidesPages {
  WebDriver driver;
  public SlidesPages(WebDriver driver) {
    this.driver = driver;
  }

  By titleSlidesPage = By.xpath("//h1[contains(text(),'Slides')]");
  public boolean isElementPresent() {
    try {
      driver.findElement(titleSlidesPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }


}
