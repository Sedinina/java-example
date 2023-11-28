package ru.stqa.menupage;

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

  public JobModulesPages clickJobModulesSection () {
    driver.findElement(jobModulesSection).click();
    return this;
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
