package Tests.ProductPage;

import Tests.Basefunctions.*;
import Tests.commonTest;
import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class QA_18 extends commonTest {
    @Inject
    private StepClick stepClick;
    @Inject
    private StepLogin stepLogin;
    @Inject
    private StepGetText stepGetText;
    @Inject
    private StepPageLoad stepPageLoad;
    @Inject
    private StepCleanup stepCleanup;


    protected void runSteps()
    {
        logger.info("[Test step 1] Log in");
        stepLogin.homePage(driver);
        logger.info("[Test step 2] Find item to use");
        stepClick.byLinkText(driver,"Gear");
        List<WebElement> productList = stepGetText.byClassName(driver,"product-item");
        stepPageLoad.implicitWaitSeconds(driver,1);
        stepClick.byWebElement(driver,productList.get(1));
        logger.info("[Test step 3] Add item to compare list");
        stepClick.byClass(driver,"tocompare");
        stepPageLoad.waitSeconds(4);
        stepClick.byClass(driver,"compare");
        assertEquals(driver.findElement(By.className("product-item-name")).getText(),"Push It Messenger Bag");
        stepCleanup.cleanCompare(driver);
    }

    @Test
    public void runTest(){runSteps();}
}
