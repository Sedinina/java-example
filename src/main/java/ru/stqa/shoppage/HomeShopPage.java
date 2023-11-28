package ru.stqa.shoppage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeShopPage {

  WebDriver driver;

  public HomeShopPage(WebDriver driver) {
    this.driver = driver;
  }

  By product = By.cssSelector("li.product");
  By sticker = By.xpath("//li[contains(@class, 'product')]//div[contains(@class, 'sticker')]");

  public HomeShopPage getProductList() {
    List<WebElement> productList = driver.findElements(product);
    return this;
  }


  public HomeShopPage getStickerList() {
    List<WebElement> stickerList = driver.findElements(sticker);
    return this;
  }

  public int getCountProductList() {
    int countProductList = driver.findElements(product).size();
    return countProductList;
  }

  public int getCountStickerList() {
    int countStickerList = driver.findElements(sticker).size();
    return countStickerList;
  }

}
