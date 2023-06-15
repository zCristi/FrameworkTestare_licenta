package Tests;

import Tests.basefunctions.StepClick;
import Tests.basefunctions.StepGetText;
import Tests.basefunctions.StepLogin;
import Tests.basefunctions.StepPageLoad;
import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class QA_20 extends commonTest{
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
        logger.info("[Test step 2] Check Contact us page is available");
        stepClick.byLinkText(driver,"Contact Us");
        assertEquals(driver.getTitle(),"Contact Us");
        logger.info("[Test step 3] Check data is auto completed correctly");
        stepPageLoad.waitSeconds(2);
        List<WebElement> fieldList = stepGetText.byClassName(driver,"input-text");
        assertEquals(fieldList.get(0).getText(),"");
        assertEquals(fieldList.get(0).getText(),"");
    }

    @Test
    public void runTest(){runSteps();}
}
