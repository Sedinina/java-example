package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LogotypePage {
  WebDriver driver;
  public LogotypePage(WebDriver driver) {
    this.driver = driver;
  }
  By logotypeSection = By.id("doc-logotype");
  By titleLogotypePage = By.xpath("//h1[contains(text(),'Logotype')]");

  public void clickLogotypeSection () {
    driver.findElement(logotypeSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleLogotypePage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }

}
