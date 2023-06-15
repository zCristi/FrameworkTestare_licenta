package Tests.basefunctions;


import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class StepClick extends Step {
    @Inject
    private WebDriverHolder webDriver;
    public void byText(WebDriver driver, String target)
    {
        driver.findElement(By.linkText(target)).click();
    }
    public void byXpath(WebDriver driver,String target)
    {
        driver.findElement(By.xpath(target)).click();
    }
    public void byId(WebDriver driver, String target)
    {
        driver.findElement(By.id(target)).click();
    }
    public void byPartialText(WebDriver driver,String target)
    {
        driver.findElement(By.partialLinkText(target)).click();
    }
    public void byClass(WebDriver driver,String target)
    {
        driver.findElement(By.className(target)).click();
    }
    public void byLinkText(WebDriver driver,String target)
    {
        driver.findElement(By.linkText(target)).click();
    }
    public void byCssSelector(WebDriver driver,String target)
    {
        driver.findElement(By.cssSelector(target)).click();
    }

    public void byWebElement(WebDriver driver, WebElement target)
    {
        target.click();
    }

}
