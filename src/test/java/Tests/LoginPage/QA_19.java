package Tests.LoginPage;

import Tests.Basefunctions.StepClick;
import Tests.Basefunctions.StepGetText;
import Tests.Basefunctions.StepLogin;
import Tests.Basefunctions.StepPageLoad;
import Tests.commonTest;
import com.google.inject.Inject;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class QA_19 extends commonTest {
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
        stepClick.byLinkText(driver,"Privacy and Cookie Policy");
        logger.info("[Test step 2] Check privacy policy page is available");
        assertEquals(driver.getTitle(),"Privacy Policy");
        logger.info("[Test step 3] Test navigation buttons work");
        stepClick.byLinkText(driver,"How We Use The Information We Collect");
    }

    @Test
    public void runTest(){runSteps();}
}
