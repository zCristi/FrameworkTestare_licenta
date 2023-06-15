package Tests;

import Tests.basefunctions.StepClick;
import Tests.basefunctions.StepGetText;
import Tests.basefunctions.StepLogin;
import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class QA_08 extends commonTest{
    @Inject
    private StepLogin stepLogin;
    @Inject
    private StepClick stepClick;
    @Inject
    private StepGetText stepGetText;
    protected void runSteps()
    {
        logger.info("[Test step 1] Log in");
        stepLogin.homePage(driver);
        stepClick.byLinkText(driver,"Women");
        logger.info("[Test step 2] Try to add item to cart");
        List<WebElement> productList = stepGetText.byClassName(driver,"product-item");
        stepClick.byWebElement(driver,productList.get(0));
        stepClick.byId(driver,"product-addtocart-button");
        logger.info("[Test step 3] Check error messages are displayed correctly");
        assertEquals(driver.findElement(By.id("super_attribute[143]-error")).getText(),"This is a required field.");
        assertEquals(driver.findElement(By.id("super_attribute[93]-error")).getText(),"This is a required field.");
    }

    @Test
    public void runTest(){runSteps();}
}
