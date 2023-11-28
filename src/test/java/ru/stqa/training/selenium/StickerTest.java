package ru.stqa.training.selenium;

import org.junit.Test;
import ru.stqa.shoppage.HomeShopPage;

public class StickerTest extends TestBase {

  @Test
  public void countStickerTest() {
    HomeShopPage homeShopPage = new HomeShopPage(driver);

    driver.get("http://localhost/litecart/en/");
    int countStickers = homeShopPage.getCountStickerList();
    int countProduct = homeShopPage.getCountProductList();
    if(countStickers>countProduct) {
      System.out.println("Где-то есть лишний стикер");
    } else if (countProduct>countStickers) {
      System.out.println("Где-то не хватает стикера");
    } else {
      System.out.println("Количество стикеров совпадает с количеством товара");
    }
  }
}
