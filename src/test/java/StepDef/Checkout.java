package StepDef;

import base.config;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

import java.time.Duration;

public class Checkout extends config {

    @And("Customer click in LG EAY{int} ADAPTERS from search result page")
    public void customerClickInLGEAYADAPTERSFromSearchResultPage(int arg0) {
        driver.findElement(By.linkText("LG EAY62949005 ADAPTERS")).click();
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


    @And("Customer click on checkout")
    public void customerClickOnCheckout() throws InterruptedException {
        driver.findElement(By.id("checkoutbttn")).click();
        Thread.sleep(1500);
    }

    @And("Customer enter their invalid email in checkout page")
    public void customerEnterTheirInvalidEmailInCheckoutPage() {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("jmawya07@gmail.com");

    }
}
