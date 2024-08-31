package StepDef;

import base.config;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPassword extends config {
    @And("Customer click on forgot password link")
    public void customerClickOnForgotPasswordLink() {
        driver.findElement(By.xpath("//*[@id='RecoverPassword']")).click();
    }
    @And("Customer enter their valid email for reset password")
    public void customerEnterTheirValidEmailForResetPassword() {

        driver.findElement(By.xpath("//*[@id='RecoverEmail']")).sendKeys("jmawya07@gmail.com");
    }
    @And("Customer click on submit button")
    public void customerClickOnSubmitButton() {

        driver.findElement(By.xpath("//*[@id='RecoverPasswordForm']/form/div[1]/div[2]/input")).click();
    }

    @And("Customer go to gmail homepage")
    public void customerGoToGmailHomepage() {
       driver.get("https://mail.google.com/mail/u/0/#inbox");
    }

    @And("customer enter their valid email in google homepage")
    public void customerEnterTheirValidEmailInGoogleHomepage() {
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("jmawya305@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
    }
}
