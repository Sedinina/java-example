package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class JobModulesPages {

  WebDriver driver;
  public JobModulesPages(WebDriver driver) {
    this.driver = driver;
  }
  By jobModulesSection = By.id("doc-jobs");
  By titleJobModulesPage = By.xpath("//h1[contains(text(),' Job Modules')]");

  public void clickJobModulesSection () {
    driver.findElement(jobModulesSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleJobModulesPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
