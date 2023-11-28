package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class OptionGroupsPages {

  WebDriver driver;
  public OptionGroupsPages(WebDriver driver) {
    this.driver = driver;
  }
  By optionGroupsSection = By.id("doc-option_groups");
  By titleOptionGroupsPage = By.xpath("//h1[contains(text(),'Option Groups')]");

  public OptionGroupsPages clickOptionGroupsSection () {
    driver.findElement(optionGroupsSection).click();
    return this;
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleOptionGroupsPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
