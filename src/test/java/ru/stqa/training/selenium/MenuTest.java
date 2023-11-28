package ru.stqa.training.selenium;

import org.junit.Test;
import ru.stqa.menupage.*;

public class MenuTest extends TestBase {

  private MenuAdmin menuAdmin;
  private LoginTest loginTest;
  private TemplatePage templatePage;
  private LogotypePage logotypePage;
  private CatalogCsvImportPages catalogCsvImportPages;
  private CatalogPage catalogPage;
  private CountriesPages countriesPages;
  private CsvImportPages csvImportPages;
  private CurrenciesPages currenciesPages;
  private CustomerModulesPages customerModulesPages;
  private CustomersPages customersPages;
  private CustomersCsvImportPages customersCsvImportPages;
  private DeliveryStatusesPages deliveryStatusesPages;
  private GeoZonesPages geoZonesPages;
  private JobModulesPages jobModulesPages;
  private LanguagesPages languagesPages;
  private ManufacturersPages manufacturersPages;
  private MonthlyPages monthlyPages;
  private MostShoppingCustomersPages mostShoppingCustomersPages;
  private MostSoldProductsPages mostSoldProductsPages;
  private NewsletterPages newsletterPages;
  private OptionGroupsPages optionGroupsPages;
  private OrdersPages ordersPages;
  private OrderStatusesPages orderStatusesPages;
  private OrderSuccessModulesPages orderSuccessModulesPages;
  private OrderTotalModulesPages orderTotalModulesPages;
  private OrderActionModulesPages orderActionModulesPages;
  private PagesPages pagesPages;
  private PaymentModulesPages paymentModulesPages;
  private ProductGroupsPages productGroupsPages;
  private QuantityUnitsPages quantityUnitsPages;
  private ScanFilesPages scanFilesPages;
  private SearchTranslationsPages searchTranslationsPages;
  private SettingsPages settingsPages;
  private ShippingModulesPages shippingModulesPages;
  private SlidesPages slidesPages;
  private SoldOutStatusesPages soldOutStatusesPages;
  private StorageEncodingPages storageEncodingPages;
  private SuppliersPages suppliersPages;
  private TaxClassesPages taxClassesPages;
  private TaxRatesPages taxRatesPages;
  private UsersPages usersPages;
  private VQmodsPages vQmodsPages;


  @Test
  public void menuAdminTest() {
    loginTest = new LoginTest();
    menuAdmin = new MenuAdmin(driver);
    templatePage = new TemplatePage(driver);
    logotypePage = new LogotypePage(driver);
    catalogCsvImportPages = new CatalogCsvImportPages(driver);
    customerModulesPages = new CustomerModulesPages(driver);
    countriesPages = new CountriesPages(driver);
    currenciesPages = new CurrenciesPages(driver);
    catalogPage = new CatalogPage(driver);
    manufacturersPages = new ManufacturersPages(driver);
    customersCsvImportPages = new CustomersCsvImportPages(driver);
    deliveryStatusesPages = new DeliveryStatusesPages(driver);
    languagesPages = new LanguagesPages(driver);
    customersPages = new CustomersPages(driver);
    jobModulesPages = new JobModulesPages(driver);
    geoZonesPages = new GeoZonesPages(driver);
    vQmodsPages = new VQmodsPages(driver);
    usersPages = new UsersPages(driver);
    taxRatesPages = new TaxRatesPages(driver);
    taxClassesPages = new TaxClassesPages(driver);
    suppliersPages = new SuppliersPages(driver);
    storageEncodingPages = new StorageEncodingPages(driver);
    soldOutStatusesPages = new SoldOutStatusesPages(driver);
    slidesPages = new SlidesPages(driver);
    shippingModulesPages = new ShippingModulesPages(driver);
    settingsPages = new SettingsPages(driver);
    searchTranslationsPages = new SearchTranslationsPages(driver);
    scanFilesPages = new ScanFilesPages(driver);
    quantityUnitsPages = new QuantityUnitsPages(driver);
    productGroupsPages = new ProductGroupsPages(driver);
    paymentModulesPages = new PaymentModulesPages(driver);
    pagesPages = new PagesPages(driver);
    orderTotalModulesPages = new OrderTotalModulesPages(driver);
    orderSuccessModulesPages = new OrderSuccessModulesPages(driver);
    orderSuccessModulesPages = new OrderSuccessModulesPages(driver);
    orderStatusesPages = new OrderStatusesPages(driver);
    orderActionModulesPages = new OrderActionModulesPages(driver);
    ordersPages = new OrdersPages(driver);
    optionGroupsPages = new OptionGroupsPages(driver);
    newsletterPages = new NewsletterPages(driver);
    mostSoldProductsPages = new MostSoldProductsPages(driver);
    mostShoppingCustomersPages = new MostShoppingCustomersPages(driver);
    monthlyPages = new MonthlyPages(driver);
    csvImportPages = new CsvImportPages(driver);


    loginTest.loginPageObjectTest();
    menuAdmin.clickAppearanceSection();
    templatePage.clickTemplateSection()
            .isElementPresent();
    logotypePage.clickLogotypeSection();
    menuAdmin.clickCatalogSection();
    catalogPage.clickCatalogSection()
            .isElementPresent();
    productGroupsPages.clickProductGroupsSection()
            .isElementPresent();
    optionGroupsPages.clickOptionGroupsSection()
            .isElementPresent();
    manufacturersPages.clickManufacturersSection()
            .isElementPresent();
    suppliersPages.clickSuppliersSection()
            .isElementPresent();
    deliveryStatusesPages.clickDeliveryStatusesSection()
            .isElementPresent();
    soldOutStatusesPages.clickSoldOutStatusesSection()
            .isElementPresent();
    quantityUnitsPages.clickTQuantityUnitsSection()
            .isElementPresent();
    catalogCsvImportPages.clickCatalogCsvImportSection()
            .isElementPresent();
    menuAdmin.clickCountriesSection();
    countriesPages.isElementPresent();
    menuAdmin.clickCurrenciesSection();
    currenciesPages.isElementPresent();
    menuAdmin.clickCustomersSection();
    customersPages.clickCustomersSection()
            .isElementPresent();
    customersCsvImportPages.clickCustomersCsvImportSection()
            .isElementPresent();
    newsletterPages.clickNewsletterSection()
            .isElementPresent();
    menuAdmin.clickGeoZonesSection();
    geoZonesPages.isElementPresent();
    menuAdmin.clickLanguagesSection();
    languagesPages.clickLanguagesSection()
            .isElementPresent();
    storageEncodingPages.clickStorageEncodingSection()
            .isElementPresent();
    menuAdmin.clickModulesSection();
    jobModulesPages.clickJobModulesSection()
            .isElementPresent();
    customerModulesPages.clickCustomerModulesSection()
            .isElementPresent();
    shippingModulesPages.clickShippingSection()
            .isElementPresent();
    paymentModulesPages.clickPaymentModulesSection()
            .isElementPresent();
    orderTotalModulesPages.clickOrderTotalSection()
            .isElementPresent();
    orderSuccessModulesPages.clickOrderSuccessSection()
            .isElementPresent();
    orderActionModulesPages.clickOrderActionSection()
            .isElementPresent();
    menuAdmin.clickOrdersSection();
    ordersPages.clickTOrdersSection()
            .isElementPresent();
    orderStatusesPages.clickOrderStatusesSection()
            .isElementPresent();
    menuAdmin.clickPagesSection();
    pagesPages.isElementPresent();
    menuAdmin.clickReportsSection();
    monthlyPages.clickMonthlySection().isElementPresent();
    mostSoldProductsPages.clickMostSoldProductsSection()
            .isElementPresent();
    mostShoppingCustomersPages.clickMostShoppingCustomersSection()
            .isElementPresent();
    menuAdmin.clickSettingsSection();
    settingsPages.isElementPresent();
    settingsPages.clickSettingsSection().clickDefaultsSection()
            .clickTitleSettingsPage().clickGeneralSection()
            .clickListingsSection().clickImagesSection()
            .clickCheckoutSection().clickAdvancedSection()
            .clickSecuritySection();
    menuAdmin.clickSlidesSection();
    slidesPages.isElementPresent();
    menuAdmin.clickTaxSection();
    taxClassesPages.clickTaxClassesSection().isElementPresent();
    taxRatesPages.clickTaxRatesSection().isElementPresent();
    menuAdmin.clickTranslationsSection();
    searchTranslationsPages.clickSearchTranslations().isElementPresent();
    scanFilesPages.clickScanFilesSection().isElementPresent();
    csvImportPages.clickCSVImportSection().isElementPresent();
    menuAdmin.clickUsersSection();
    usersPages.isElementPresent();
    menuAdmin.clickVQmodsSection();
    vQmodsPages.clickVQmodsPage();
    vQmodsPages.isElementPresent();
  }
}
