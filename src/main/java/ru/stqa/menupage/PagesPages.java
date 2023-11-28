package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class PagesPages {

  WebDriver driver;
  public PagesPages(WebDriver driver) {
    this.driver = driver;
  }

  By titlePagesPage = By.xpath("//h1[contains(text(),'Pages')]");

  public boolean isElementPresent() {
    try{
      driver.findElement(titlePagesPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
