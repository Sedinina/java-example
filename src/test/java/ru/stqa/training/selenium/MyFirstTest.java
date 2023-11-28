package ru.stqa.training.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTest extends TestBase {

  @Test
  public void myFirstTest() {
    driver.get("https://www.google.com");
    driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);
    wait.until(titleIs("webdriver - Поиск в Google"));
  }

  @Test
  public void mySecondTest() {
    driver.get("http://localhost/litecart/en/");
    driver.findElement(By.xpath("//li[contains(@class, 'product')]//div[contains(@class, 'sticker')]")).click();

  }

}
