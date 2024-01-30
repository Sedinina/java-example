package ru.stqa.training.selenium.test;

import org.junit.Test;

public class AddProductPageObjectTest extends BaseTest{
  @Test
  public void addProductCartTest() {
    for (int i = 0; i < 3; i++) {
      app.storeHomePage.openStoreHomePage().listProductMostPopular(i);
      app.productPage.selectOptions().clickButtonAddCart().updateCounter(i);
    }
    app.productPage.clickButtonCart();
    for (int i = 0; i < app.cartPage.listProductCart(); i++) {
      app.cartPage.clickButtonRemove().waitTable();
    }
  }

}
