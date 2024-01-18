package ru.stqa.training.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.SimpleDateFormat;
import java.util.List;

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

    driver.findElement(By.className("select2-selection__arrow")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("select2-search__field"))).sendKeys("United States");
    List<WebElement> search = driver.findElements(By.className("select2-results__options"));

    new Actions(driver)
            .moveToElement(search.get(0))
            .click()
            .perform();

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
