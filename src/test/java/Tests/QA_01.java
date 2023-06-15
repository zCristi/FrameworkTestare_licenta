package Tests;

import Tests.basefunctions.StepClick;
import org.testng.annotations.Test;

import com.google.inject.Inject;

import static org.testng.AssertJUnit.assertEquals;

public class QA_01 extends commonTest {

    @Inject
    private StepClick stepClick;


    protected void runSteps()
    {
        logger.info("[Test step 1] Check Sign in button works");
        stepClick.byText(driver,"Sign In");
        assertEquals(driver.getTitle(),"Customer Login");
    }

    @Test
    public void runTest(){runSteps();}
}
