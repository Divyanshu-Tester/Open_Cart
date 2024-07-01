package pageObject;

import test_Base.Base_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration_Page extends Base_Class 
{ //WebDriver driver;

    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='input-newsletter-yes']")
    WebElement subscribe;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement agree;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement continueButton;

    public Registration_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
    }

    public void setFirstName(String fname) {
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys(fname);
    }

    public void setLastName(String lname) {
        wait.until(ExpectedConditions.visibilityOf(lastName));
        lastName.sendKeys(lname);
    }

    public void setEmail(String emailValue) {
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(emailValue);
    }

    public void setPassword(String pwd) {
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(pwd);
    }

    public void selectSubscribe() {
        wait.until(ExpectedConditions.elementToBeClickable(subscribe));
        subscribe.click();
    }

    public void selectAgree() {
        wait.until(ExpectedConditions.elementToBeClickable(agree));
        agree.click();
    }

    public void selectContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }
}