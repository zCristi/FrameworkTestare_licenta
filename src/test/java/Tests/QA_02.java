package Tests;


import Tests.basefunctions.StepClick;
import Tests.basefunctions.StepSetText;
import com.google.inject.Inject;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class QA_02 extends commonTest {
    @Inject
    private StepClick stepClick;
    @Inject
    private StepSetText stepSetText;
    protected void runSteps()
    {
        logger.info("[Test step 1] Check ability to log in works");
        stepClick.byText(driver,"Sign In");
        stepSetText.byId(driver,"email","testbot@gmail.com");
        stepSetText.byId(driver,"pass","Testbot1");
        stepClick.byId(driver,"send2");
        assertEquals(driver.getTitle(),"Home Page");
    }

    @Test
    public void runTest(){runSteps();}
}
