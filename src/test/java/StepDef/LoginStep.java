package StepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginStep extends config {
    @And("Customer enter their valid email log in page")
    public void customerEnterTheirValidEmailLogInPage() {
        driver.findElement(By.name("customer[email]")).sendKeys("jmawya07@gmail.com");

    }

    @And("Customer enter valid password in log in page")
    public void customerEnterValidPasswordInLogInPage() {
        driver.findElement(By.name("customer[password]")).sendKeys("Test12345");
    }

    @When("Customer click on sign in button")
    public void customerClickOnSignInButton() {
        driver.findElement(By.xpath("//*[@id='customer_login']/div[1]/p[2]/input")).click();
    }


    @Then("Customer successfully able to Log in at LG parts")
    public void customerSuccessfullyAbleToLogInAtLGParts() {
        String exp="Home";
        String act=driver.findElement(By.xpath("//*[@id='wpbBreadcrumbs']/div/div/div/div/nav/ol/li/a/span")).getText();
        Assert.assertEquals(act, exp);
        driver.findElement(By.xpath("//*[@id='wpbBreadcrumbs']/div/div/div/div/nav/ol/li/a/span")).click();
    }

    @And("Customer enter their invalid email log in page")
    public void customerEnterTheirInvalidEmailLogInPage() {
        driver.findElement(By.name("customer[email]")).sendKeys("jmawya07rgmail.com");
    }

    @And("Customer enter invalid password in log in page")
    public void customerEnterInvalidPasswordInLogInPage() {
        driver.findElement(By.name("customer[password]")).sendKeys("Tesft12345");
    }

    @Then("Customer should not able to Log in at LG parts")
    public void customerShouldNotAbleToLogInAtLGParts() {
        String exp="Home";
        String act=driver.findElement(By.xpath("//*[@id='wpbBreadcrumbs']/div/div/div/div/nav/ol/li/a/span")).getText();
        Assert.assertEquals(act, exp);
        driver.findElement(By.xpath("//*[@id='wpbBreadcrumbs']/div/div/div/div/nav/ol/li/a/span")).click();

    }
}
