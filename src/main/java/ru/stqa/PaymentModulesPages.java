package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class PaymentModulesPages {

  WebDriver driver;
  public PaymentModulesPages(WebDriver driver) {
    this.driver = driver;
  }
  By paymentSection = By.id("doc-payment");
  By titleTemplatePage = By.xpath("//h1[contains(text(),'Payment Modules')]");

  public void clickPaymentModulesSection () {
    driver.findElement(paymentSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleTemplatePage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
