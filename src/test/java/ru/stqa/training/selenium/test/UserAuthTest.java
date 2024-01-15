package ru.stqa.training.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.SimpleDateFormat;

public class UserAuthTest extends TestBase {

  public static String getRandomEmail() {
    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
    return "java" + timestamp + "@example.com";
  }

  @Test
  public void userAuthTest() {
    String email = getRandomEmail();
    String password = "123";

    driver.get("http://localhost/litecart/en/");

    driver.findElement(By.linkText("New customers click here")).click();
    driver.findElement(By.name("firstname")).sendKeys("Name");
    driver.findElement(By.name("lastname")).sendKeys("LastName");
    driver.findElement(By.name("address1")).sendKeys("Address");
    driver.findElement(By.name("postcode")).sendKeys("12345");
    driver.findElement(By.name("city")).sendKeys("City");

    Select country = new Select(driver.findElement(By.name("country_code")));
    country.selectByVisibleText("United States");

    driver.findElement(By.name("email")).sendKeys(email);
    driver.findElement(By.name("phone")).sendKeys("123456789");
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.name("confirmed_password")).sendKeys(password);
    driver.findElement(By.name("create_account")).click();
    logout();

    driver.findElement(By.name("email")).sendKeys(email);
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.name("login")).click();
    logout();

  }
}
