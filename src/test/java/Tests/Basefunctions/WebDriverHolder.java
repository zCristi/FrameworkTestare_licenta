package Tests.Basefunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHolder extends Step {



    public WebDriver createDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Proiecte\\IntelliJ\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com");
        return driver;
    }
    public WebDriver get()
    {
        return driver;
    }
}
