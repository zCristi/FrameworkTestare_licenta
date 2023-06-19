package Tests.ShopPage;

import Tests.Basefunctions.*;
import Tests.commonTest;
import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class QA_07 extends commonTest {
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
        logger.info("[Test step 2] Go to Sale tab");
        stepClick.byLinkText(driver,"Sale");
        stepClick.byLinkText(driver,"Hoodies and Sweatshirts");
        stepPageLoad.waitSeconds(1);
        List<WebElement> productList = stepGetText.byClassName(driver,"product-item");
        logger.info("[Test step 3] Check products are displayed correctly");
        stepClick.byWebElement(driver,productList.get(0));
        assertEquals(driver.getTitle(),"Circe Hooded Ice Fleece");
    }

    @Test
    public void runTest(){runSteps();}
}
