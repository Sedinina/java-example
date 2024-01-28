package ru.stqa.training.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LogsTest extends TestBase {
  LoginTest loginTest;

  @Test
  public void logsTest() {
    loginTest = new LoginTest();
    loginTest.loginPageObjectTest();

    driver.get("http://localhost/litecart/admin/?app=catalog&doc=catalog&category_id=1");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

    List<WebElement> productList = driver.findElements(By.cssSelector("a[href*='product_id']"));
    for (int i = 1; i < productList.size(); i++) {
      driver.get("http://localhost/litecart/admin/?app=catalog&doc=catalog&category_id=1");
      productList = driver.findElements(By.cssSelector("a[href*='product_id']"));
      productList.get(i).click();

      driver.manage().logs().get("browser").forEach(System.out::println);
    }
  }
}
