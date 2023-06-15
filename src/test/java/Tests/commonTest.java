package Tests;


import Tests.basefunctions.WebDriverHolder;
import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;

import java.util.logging.Logger;

@Guice
public abstract class commonTest {

    @Inject
    private WebDriverHolder webDriver;
    WebDriver driver;
    Logger logger;
    @BeforeMethod
    public void setup()
    {
        driver = webDriver.createDriver();
        logger = Logger.getLogger(this.getClass().getName());
        logger.info("Browser opened");
    }
    @AfterMethod
    public void cleanup()
    {
        driver.quit();
        logger.info("Browser closed");
    }


}
