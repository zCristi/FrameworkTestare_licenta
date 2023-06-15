package Tests;

import Tests.basefunctions.StepClick;
import Tests.basefunctions.StepGetText;
import Tests.basefunctions.StepLogin;
import Tests.basefunctions.StepPageLoad;
import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class QA_12 extends commonTest{
    @Inject
    private StepLogin stepLogin;
    @Inject
    private StepClick stepClick;
    @Inject
    private StepGetText stepGetText;
    @Inject
    private StepPageLoad stepPageLoad;
    protected void runSteps()
    {
        logger.info("[Test step 1] Log in");
        stepLogin.homePage(driver);
        logger.info("[Test step 2] Add item to cart");
        stepClick.byLinkText(driver,"Women");
        List<WebElement> productList = stepGetText.byClassName(driver,"product-item");
        stepPageLoad.implicitWaitSeconds(driver,1);
        stepClick.byWebElement(driver,productList.get(0));
        List<WebElement> sizeList = stepGetText.byClassName(driver,"swatch-option");
        stepClick.byWebElement(driver,sizeList.get(0));
        stepClick.byWebElement(driver,sizeList.get(5));
        stepClick.byId(driver,"product-addtocart-button");
        stepPageLoad.waitSeconds(2);
        logger.info("[Test step 3] Check view and edit cart still works");
        stepClick.byClass(driver,"showcart");
        stepClick.byLinkText(driver,"View and Edit Cart");
        assertEquals(driver.getTitle(),"Shopping Cart");
    }

    @Test
    public void runTest(){runSteps();}
}
