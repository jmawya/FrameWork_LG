package StepDef;

import base.config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SignUpStep extends config {
    Faker f=new Faker();


    @Given("Customer at LG Parts Homepage")
    public void customerAtLGPartsHomepage() {
    String exp="LG Replacement Parts | Genuine Appliance Parts & Accessories| LG Parts";
    String act=driver.getTitle();
        Assert.assertEquals(act, exp);
    }

    @And("Customer click on log in link")
    public void customerClickOnLogInLink() {
        driver.findElement(By.cssSelector("i[class='fa fa-user-o ll-at-background-prevent']")).click();
    }

    @And("Customer click on create account link")
    public void customerClickOnCreateAccountLink() throws InterruptedException {
       // driver.findElement(By.cssSelector("div[class='popupclose']")).click();

        driver.findElement(By.xpath("//*[@id='pageContent']/div/div/div/div[2]/div/div/div[2]/a")).click();
        Thread.sleep(1500);
    }

    @And("Customer enter their valid First name")
    public void customerEnterTheirValidFirstName() {
        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
        driver.findElement(By.name("customer[first_name]")).sendKeys("Jannatul");
    }

    @And("Customer enter their valid Last name")
    public void customerEnterTheirValidLastName() {
        driver.findElement(By.name("customer[last_name]")).sendKeys("Mawya");
    }

    @And("Customer enter their valid email")
    public void customerEnterTheirValidEmail() {
        String randomemail=f.internet().emailAddress();
        driver.findElement(By.name("customer[email]")).sendKeys(randomemail);
    }

    @And("Customer enter valid password")
    public void customerEnterValidPassword() {
        driver.findElement(By.name("customer[password]")).sendKeys("Jmawya07@");

    }

    @When("Customer click on create account button from create account page")
    public void customerClickOnCreateAccountButtonFromCreateAccountPage() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id='create_customer']/div[1]/div[5]/input")).click();
        Thread.sleep(1500);

    }

    @Then("Customer is not able to create an account in LG parts")
    public void customerSuccessfullyAbleToCreateAnAccountInLGParts() {
        String exp="Home";
        String act=driver.findElement(By.xpath("//*[@id='wpbBreadcrumbs']/div/div/div/div/nav/ol/li/a/span")).getText();
        Assert.assertEquals(act, exp);


    }

    @Then("Customer successfully able to create an account in LG parts")
    public void customerisnotAbleToCreateAnAccountInLGParts() throws InterruptedException {
        String exp="Home";
        String act=driver.findElement(By.xpath("//*[@id='wpbBreadcrumbs']/div/div/div/div/nav/ol/li/a/span")).getText();
        Assert.assertEquals(act, exp);
        driver.findElement(By.xpath("//*[@id='wpbBreadcrumbs']/div/div/div/div/nav/ol/li/a/span")).click();
        Thread.sleep(1500);
    }
}
