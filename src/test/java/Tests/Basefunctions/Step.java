package Tests.Basefunctions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Guice;
import java.util.logging.Logger;

@Guice
public abstract class Step {
    protected WebDriver driver;
    protected Logger logger;
}
