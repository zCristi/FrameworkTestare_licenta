package Tests.Basefunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StepGetText extends Step{
    public List<WebElement> byClassName(WebDriver driver, String target)
    {
        List<WebElement> list = driver.findElements(By.className(target));
        return list;
    }
    public List<WebElement> byCssSelector(WebDriver driver, String target)
    {
        List<WebElement> list = driver.findElements(By.cssSelector(target));
        return list;
    }
}
