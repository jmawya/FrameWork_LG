package StepDef;

import base.config;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class Search extends config {
    @When("Customer type LG ADAPTERS in search edit box and click on search icon")
    public void customerTypeLGADAPTERSInSearchEditBoxAndClickOnSearchIcon() {
       driver.findElement(By.cssSelector("input[placeholder='Search by part#, model#, keyword']")).sendKeys("LG ADAPTERS");
        driver.findElement(By.id("wpbSearchButton")).sendKeys("LG ADAPTERS");
    }

    @Then("Customer able to see list of LG ADAPTERS in search result page")
    public void customerAbleToSeeListOfFiveCaratDiamondRingInSearchResultPage() {
        String exp="Your search for \"LG ADAPTERS\" revealed the following:";
        String act=driver.findElement(By.xpath("//*[@id='pageContent']/div/div/h1")).getText();
        Assert.assertEquals(act, exp);
    }
}
