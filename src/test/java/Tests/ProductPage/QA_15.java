package Tests.ProductPage;

import Tests.Basefunctions.StepClick;
import Tests.Basefunctions.StepGetText;
import Tests.Basefunctions.StepLogin;
import Tests.Basefunctions.StepPageLoad;
import Tests.commonTest;
import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class QA_15 extends commonTest {
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
        stepClick.byLinkText(driver,"Gear");
        List<WebElement> productList = stepGetText.byClassName(driver,"product-item");
        stepPageLoad.implicitWaitSeconds(driver,1);
        stepClick.byWebElement(driver,productList.get(1));
        List<WebElement> sizeList = stepGetText.byClassName(driver,"swatch-option");
        stepClick.byId(driver,"product-addtocart-button");

        logger.info("[Test step 3] Check delete button works");
        stepPageLoad.waitSeconds(4);
        stepClick.byClass(driver,"showcart");
        stepClick.byLinkText(driver,"View and Edit Cart");
        List<WebElement> deleteList = stepGetText.byClassName(driver,"action-delete");
        stepClick.byWebElement(driver,deleteList.get(0));
        assertEquals(driver.findElement(By.className("cart-empty")).getText(),"You have no items in your shopping cart.\n" +
                "Click here to continue shopping.");
    }

    @Test
    public void runTest(){runSteps();}
}
