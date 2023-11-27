package ru.stqa.training.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.stqa.LoginPage;
import ru.stqa.MenuAdmin;

public class LoginTest extends TestBase {
  private LoginPage loginPage;

//  @Test
//  public void loginTest() {
//    driver.get("http://localhost/litecart/admin/login.php");
//    driver.findElement(By.name("username")).sendKeys("admin");
//    driver.findElement(By.name("password")).sendKeys("admin");
//    driver.findElement(By.name("login")).click();
//  }

  @Test
  //("Попробовала PageObject")
  public void loginPageObjectTest() {
    loginPage = new LoginPage(driver);
    loginPage.openPage()
            .fillUsername("admin")
            .fillPassword("admin")
            .clickButton();
  }
}
