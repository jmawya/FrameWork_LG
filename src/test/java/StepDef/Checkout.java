package StepDef;

import base.config;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

        WebElement nine=driver.findElement(By.xpath("//*[@id='checkoutbttn']"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(nine));
        nine.click();

    }

    @And("Customer enter their invalid email in checkout page")
    public void customerEnterTheirInvalidEmailInCheckoutPage() {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("jmawya07@gmail.com");

    }
}
