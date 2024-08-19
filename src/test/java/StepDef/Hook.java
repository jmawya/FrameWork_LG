package StepDef;

import base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.util.Strings;


public class Hook extends config {
    public static String browserType=System.getProperty("browser");
    public static String envType=System.getProperty("env");

    @Before
    public void beforeEachTest(){
        if(Strings.isNullOrEmpty(browserType)){
            browserType= "Chrome";
        }
        if(Strings.isNullOrEmpty(envType)){
            envType="QA";
        }

        driver=setupBrowser(browserType);
        if(envType.equalsIgnoreCase("qa")){
            driver.get("https://lgparts.com/");
        }
        else{
            System.out.println("invalid envType:" +envType);
        }

    }
    @After
    public void afterEachTest(){
        driver.quit();
    }
}
