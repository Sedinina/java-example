package ru.stqa.training.selenium.test;

import org.junit.Before;
import ru.stqa.training.selenium.app.Application;

public class BaseTest {

  public static ThreadLocal<Application> tlApp = new ThreadLocal<>();
  public Application app;

  @Before
  public void start() {
    if (tlApp.get() != null) {
      app = tlApp.get();
      return;
    }

    app = new Application();
    tlApp.set(app);

    Runtime.getRuntime().addShutdownHook(
            new Thread(() -> { app.quit(); app = null; }));
  }

}
