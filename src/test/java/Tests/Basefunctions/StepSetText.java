package Tests.Basefunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepSetText extends Step {

    public void byXpath(WebDriver driver, String target, String text)
    {
        driver.findElement(By.xpath(target)).sendKeys(text);
    }
    public void byId(WebDriver driver, String target, String text)
    {
        driver.findElement(By.id(target)).sendKeys(text);
    }
}
