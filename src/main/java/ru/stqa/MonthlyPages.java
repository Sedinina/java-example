package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class MonthlyPages {

  WebDriver driver;
  public MonthlyPages(WebDriver driver) {
    this.driver = driver;
  }
  By monthlySection = By.id("doc-monthly_sales");
  By titleMonthlyPages = By.xpath("//h1[contains(text(),' Monthly Sales')]");

  public void clickMonthlySection () {
    driver.findElement(monthlySection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleMonthlyPages);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
