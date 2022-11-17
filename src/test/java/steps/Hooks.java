package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.HerokuHomePage;
import pages.HerokuPage;
import utils.Driver;

public class Hooks {
    public static WebDriver driver;
    public static HerokuPage herokuPage;
    public static HerokuHomePage herokuHomePage;

    @Before
    public void setDriver() {
        driver = Driver.getDriver();
        herokuPage = new HerokuPage();
        herokuHomePage = new HerokuHomePage();
    }

    @After
    public void teardown(Scenario scenario){
        System.out.println("Scenario = " + scenario.getName() + " status = " +  scenario.getStatus());
        try{
            if(scenario.isFailed()){
                byte[] screenshot = ((TakesScreenshot)Driver.getDriver())
                        .getScreenshotAs(OutputType.BYTES);

                scenario.embed(screenshot, "image/png");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            Driver.quitDriver();
        }
    }
}
