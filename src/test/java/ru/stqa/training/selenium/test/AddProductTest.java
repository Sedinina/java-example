package ru.stqa.training.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AddProductTest extends TestBase {
  private LoginTest loginTest;


  @Test
  public void addProductTest() {

    loginTest = new LoginTest();
    loginTest.loginPageObjectTest();

    driver.findElement(By.cssSelector("a[href*='catalog']")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

    driver.findElement(By.linkText("Add New Product")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

    List<WebElement> radioBox = driver.findElements(By.name("status"));
    radioBox.get(0).click();

    driver.findElement(By.name("name[en]")).sendKeys("United States");
    driver.findElement(By.name("code")).sendKeys("US");

    List<WebElement> box = driver.findElements(By.name("product_groups[]"));
    box.get(0).click();

    driver.findElement(By.name("quantity")).sendKeys("10");
    driver.findElement(By.name("date_valid_from")).sendKeys("15.01.2024");
    driver.findElement(By.name("date_valid_to")).sendKeys("25.01.2024");

    driver.findElement(By.linkText("Information")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("manufacturer_id")));

    select("[name='manufacturer_id']", "ACME Corp.");
    driver.findElement(By.name("keywords")).sendKeys("keywords");
    driver.findElement(By.name("short_description[en]")).sendKeys("short_description");
    driver.findElement(By.name("head_title[en]")).sendKeys("head_title");
    driver.findElement(By.name("meta_description[en]")).sendKeys("meta_description");

    driver.findElement(By.linkText("Prices")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("purchase_price_currency_code")));

    driver.findElement(By.name("purchase_price")).sendKeys("22.2");
    select("[name='purchase_price_currency_code']", "US Dollars");
    driver.findElement(By.name("gross_prices[USD]")).sendKeys("12.2");
    driver.findElement(By.name("gross_prices[EUR]")).sendKeys("15.2");
    driver.findElement(By.name("save")).click();

  }


}
