package Tests.Basefunctions;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StepPageLoad extends Step{
    public void implicitWaitSeconds(WebDriver driver, int number)
    {
        driver.manage().timeouts().implicitlyWait(number, TimeUnit.SECONDS);
    }
    public void waitSeconds( int number)
    {
        try {
            Thread.sleep(number*1000);}
        catch (Exception e){

        }
    }
}
