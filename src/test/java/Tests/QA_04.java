package Tests;

import Tests.basefunctions.StepClick;
import Tests.basefunctions.StepGetText;
import Tests.basefunctions.StepLogin;
import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class QA_04 extends commonTest{
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
        logger.info("[Test step 2] Check product list");
        stepClick.byLinkText(driver,"Men");
        List<WebElement> productList = stepGetText.byClassName(driver,"product-item");
        stepClick.byWebElement(driver,productList.get(0));
        assertEquals(driver.getTitle(),"Argus All-Weather Tank");
    }

    @Test
    public void runTest(){runSteps();}
}
