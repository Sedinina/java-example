package ru.stqa.training.selenium.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.training.selenium.pages.CartPage;
import ru.stqa.training.selenium.pages.ProductPage;
import ru.stqa.training.selenium.pages.StoreHomePage;

public class Application {
  private WebDriver driver;
  public StoreHomePage storeHomePage;
  public ProductPage productPage;
  public CartPage cartPage;

  public Application() {
    driver = new ChromeDriver();
    storeHomePage = new StoreHomePage(driver);
    productPage = new ProductPage(driver);
    cartPage = new CartPage(driver);

  }

  public void quit() {
    driver.quit();
  }

}
