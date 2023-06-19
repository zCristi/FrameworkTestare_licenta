package Tests.Basefunctions;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;

public class StepLogin extends Step{
    @Inject
    private StepClick stepClick;
    @Inject
    private StepSetText stepSetText;
    public void homePage(WebDriver driver)
    {
        stepClick.byText(driver,"Sign In");
        stepSetText.byId(driver,"email","testbot@gmail.com");
        stepSetText.byId(driver,"pass","Testbot1");
        stepClick.byId(driver,"send2");
    }
}
