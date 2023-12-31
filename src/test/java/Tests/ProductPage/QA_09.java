package Tests.ProductPage;

import Tests.Basefunctions.*;
import Tests.commonTest;
import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class QA_09 extends commonTest {
    @Inject
    private StepLogin stepLogin;
    @Inject
    private StepClick stepClick;
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
        stepClick.byLinkText(driver,"Women");
        logger.info("[Test step 2] Add item to cart");
        List<WebElement> productList = stepGetText.byClassName(driver,"product-item");
        stepPageLoad.implicitWaitSeconds(driver,1);
        stepClick.byWebElement(driver,productList.get(0));
        List<WebElement> sizeList = stepGetText.byClassName(driver,"swatch-option");
        stepClick.byWebElement(driver,sizeList.get(0));
        stepClick.byWebElement(driver,sizeList.get(5));
        stepClick.byId(driver,"product-addtocart-button");
        logger.info("[Test step 3] Check product was added to cart");
        stepPageLoad.waitSeconds(4);
        stepClick.byClass(driver,"showcart");
        assertEquals(driver.findElement(By.className("product-item-name")).getText(),"Radiant Tee");
        stepClick.byClass(driver,"showcart");
        stepCleanup.cleanCart(driver);
    }

    @Test
    public void runTest(){runSteps();}
}
