package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class TemplatePage {

  WebDriver driver;

  public TemplatePage(WebDriver driver) {
    this.driver = driver;
  }

  By templateSection = By.id("doc-template");
  By titleTemplatePage = By.xpath("//h1[contains(text(),'Template')]");

  public void clickTemplateSection() {
    driver.findElement(templateSection).click();
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleTemplatePage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
