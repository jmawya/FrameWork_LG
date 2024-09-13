package StepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static java.time.Duration.of;
import static java.time.Duration.ofSeconds;

public class Checkout extends config {

    @And("customer click in LG EAY{int} ADAPTERS from search result page")
    public void customerClickInLGEAYADAPTERSFromSearchResultPage(int arg0) {
        driver.findElement(By.linkText("LG EAY62990908 ADAPTERS")).click();
    }
    @And("customer click on Add to cart")
    public void customerClickOnAddToCart() {
        driver.findElement(By.id("AddToCart")).click();
    }

    @And("customer click on view cart")
    public void customerClickOnViewCart() {

        driver.findElement(By.xpath("//*[@id='cartContainer']/form/div/div[3]/div[2]/div[2]/a")).click();

    }


    @And("customer click on check out button")
    public void customerClickOnCheckout() {
        WebElement nine=driver.findElement(By.cssSelector("input[value='Check Out']"));
        WebDriverWait wait=new WebDriverWait(driver, ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(nine));
        nine.click();

    }



    @And("customer enter their FirstName in checkout page")
    public void customerEnterTheirFirstNameInCheckoutPage() {

         driver.findElement(By.xpath("//*[@id=\"TextField0\"]")).sendKeys("Jannatul");

    }

    @And("customer enter their lastname in checkout page")
    public void customerEnterTheirLastnameInCheckoutPage() {

        driver.findElement(By.xpath("//*[@id=\"TextField1\"]")).sendKeys("Mawya");
    }

    @And("customer enter their Address in checkout page")
    public void customerEnterTheitAddressInCheckoutPage() {
        driver.findElement(By.xpath("//*[@id=\"shipping-address1\"]")).sendKeys("674 Rockaway Parkway");
    }

    @And("customer enter their city  in checkout page")
    public void customerEnterTheirCityInCheckoutPage() {
        driver.findElement(By.name("city")).sendKeys("Brooklyn");
    }

    @And("customer enter their state  in checkout page")
    public void customerEnterTheirStateInCheckoutPage() {
      WebElement list = driver.findElement(By.name("zone"));
      Select se =new Select(list);
      se.selectByVisibleText("New York");
    }

    @And("customer enter their zip code  in checkout page")
    public void customerEnterTheirZipCodeInCheckoutPage() {

        driver.findElement(By.name("postalCode")).sendKeys("11236");
    }

    @And("customer enter their phone number  in checkout page")
    public void customerEnterTheirPhoneNumberInCheckoutPage() {

        driver.findElement(By.cssSelector("input[placeholder='Phone']")).sendKeys("1 (601) 952-1325");
    }

    @And("customer enter email")
    public void customerEnterEmail() {

        WebElement nine=driver.findElement(By.cssSelector("input[placeholder='Email']"));
        WebDriverWait wait=new WebDriverWait(driver, ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(nine));
        nine.sendKeys("jmawya07@gmail.com");
        }

    @And("customer enter valid card number")
    public void customerEnterValidCardNumber() {
        List<WebElement> na=driver.findElements(By.tagName("iframe"));
        System.out.println(na.size());
        driver.switchTo().frame(0);

        WebElement nine=driver.findElement(By.cssSelector("input[placeholder='Card number']"));
        WebDriverWait wait=new WebDriverWait(driver, ofSeconds(500));
        wait.until(ExpectedConditions.visibilityOf(nine));
        nine.sendKeys("4111 1111 1111 1111");
    }

    @And("customer enter card expire date")
    public void customerEnterCardExpireDate() {
        List<WebElement> a=driver.findElements(By.tagName("iframe"));
        System.out.println(a.size());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);



        WebElement nine=driver.findElement(By.cssSelector("input[placeholder='Expiration date (MM / YY)']"));
        WebDriverWait Wait=new WebDriverWait(driver, ofSeconds(600));
        Wait.until(ExpectedConditions.visibilityOf(nine));
        nine.sendKeys("8/30");
    }

    @And("customer enter valid security code")
    public void customerEnterValidSecurityCode() {
        List<WebElement> ad=driver.findElements(By.tagName("iframe"));
        System.out.println(ad.size());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);

        WebElement nine=driver.findElement(By.cssSelector("input[placeholder='Security code']"));
        WebDriverWait wait=new WebDriverWait(driver,ofSeconds(600));
        wait.until(ExpectedConditions.visibilityOf(nine));
        nine.sendKeys("852");
    }

    @When("customer click on continue button from checkout page")
    public void customerClickOnContinueButtonFromCheckoutPage() {
        driver.switchTo().defaultContent();
      WebElement D=driver.findElement(By.cssSelector("button[id='checkout-pay-button']"));
      WebDriverWait wait=new WebDriverWait(driver,ofSeconds(600));
      wait.until(ExpectedConditions.visibilityOf(D));
      D.click();
    }
}

