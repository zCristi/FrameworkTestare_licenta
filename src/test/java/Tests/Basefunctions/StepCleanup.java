package Tests.Basefunctions;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class StepCleanup extends Step{
    @Inject
    private StepClick stepClick;
    @Inject
    private StepGetText stepGetText;
    public void cleanCart(WebDriver driver)
    {
        stepClick.byClass(driver,"showcart");
        stepClick.byLinkText(driver,"View and Edit Cart");
        List<WebElement> deleteList = stepGetText.byClassName(driver,"action-delete");
        stepClick.byWebElement(driver,deleteList.get(0));
        assertEquals(driver.findElement(By.className("cart-empty")).getText(),"You have no items in your shopping cart.\n" +
                "Click here to continue shopping.");
    }
    public void cleanCompare(WebDriver driver)
    {
        stepClick.byClass(driver,"delete");
    }
}
