package Tests.ShopPage;

import Tests.Basefunctions.StepClick;
import Tests.Basefunctions.StepGetText;
import Tests.Basefunctions.StepLogin;
import Tests.commonTest;
import com.google.inject.Inject;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class QA_06 extends commonTest {
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
        logger.info("[Test step 2] Check tab exists");
        stepClick.byLinkText(driver,"Training");
        assertEquals(driver.getTitle(),"Training");
    }

    @Test
    public void runTest(){runSteps();}
}

