package StepDef;

import base.config;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Checkout extends config {

    @And("Customer click in LG EAY{int} ADAPTERS from search result page")
    public void customerClickInLGEAYADAPTERSFromSearchResultPage(int arg0) {
        driver.findElement(By.linkText("LG EAY62990908 ADAPTERS")).click();
    }
    @And("Customer click on Add to cart")
    public void customerClickOnAddToCart() {
        driver.findElement(By.id("AddToCart")).click();
    }

    @And("Customer click on view cart")
    public void customerClickOnViewCart() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));

        driver.findElement(By.xpath("//*[@id='cartContainer']/form/div/div[3]/div[2]/div[2]/a")).click();

    }


    @And("Customer click on checkout button")
    public void customerClickOnCheckout() {

       driver.findElement(By.id("checkoutbttn")).click();

    }

    @And("Customer enter their invalid email in checkout page")
    public void customerEnterTheirInvalidEmailInCheckoutPage() {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("jmawya07@gmail.com");

    }

    @And("Customer enter their FirstName in checkout page")
    public void customerEnterTheirFirstNameInCheckoutPage() {
        driver.findElement(By.cssSelector("input[placeholder='First name']")).sendKeys("Jannatul");
    }

    @And("Customer enter their lastname in checkout page")
    public void customerEnterTheirLastnameInCheckoutPage() {

        driver.findElement(By.cssSelector("input[placeholder='Last name']")).sendKeys("Mawya");
    }

    @And("Customer enter their Address in checkout page")
    public void customerEnterTheitAddressInCheckoutPage() {
        driver.findElement(By.cssSelector("input[placeholder='Address']")).sendKeys("674 Rockaway Parkway");
    }

    @And("Customer enter their city  in checkout page")
    public void customerEnterTheirCityInCheckoutPage() {
        driver.findElement(By.name("city")).sendKeys("Brooklyn");
    }

    @And("Customer enter their state  in checkout page")
    public void customerEnterTheirStateInCheckoutPage() {
      WebElement list = driver.findElement(By.name("zone"));
      Select se =new Select(list);
      se.selectByVisibleText("New York");
    }

    @And("Customer enter their zip code  in checkout page")
    public void customerEnterTheirZipCodeInCheckoutPage() {

        driver.findElement(By.name("postalCode")).sendKeys("11236");
    }

    @And("Customer enter their phone number  in checkout page")
    public void customerEnterTheirPhoneNumberInCheckoutPage() {

        driver.findElement(By.xpath("//*[@id=\"TextField14\"]")).sendKeys("1 (601) 952-1325");
    }
}
