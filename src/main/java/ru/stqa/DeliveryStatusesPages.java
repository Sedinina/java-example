package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DeliveryStatusesPages {

  WebDriver driver;
  public DeliveryStatusesPages(WebDriver driver) {
    this.driver = driver;
  }
  By deliveryStatusesSection = By.id("doc-delivery_statuses");
  By titleDeliveryStatusesPage = By.xpath("//h1[contains(text(),'Delivery Statuses')]");

  public void clickDeliveryStatusesSection () {
    driver.findElement(deliveryStatusesSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleDeliveryStatusesPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
