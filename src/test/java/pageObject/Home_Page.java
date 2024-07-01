package pageObject;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_Base.Base_Class;

public class Home_Page extends Base_Class


{
	
public WebDriver driver;

    @FindBy(xpath="//span[normalize-space()='My Account']")           // FINDING THE MY MY ACCOUNT DROP DOWN 
    WebElement Click_MyAccount;
   
    @FindBy(xpath="//a[normalize-space()='Login']")                   // FINDING THE LOGIN BUTTON UNDR THE MY ACCOUNT 
    WebElement Click_Login;
    
    @FindBy(xpath="//a[normalize-space()='Register']")                //FINDIN THE REGISTER BUTTON 
    WebElement Click_Register; 
    
    public Home_Page(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    
    // CLICK ACTION BUTTON METHOD FOR MY ACCOUNT ON THE HOME 
    
    public void Click_MyAccount() throws InterruptedException
    {
    	
    	Click_MyAccount.click();
    }
    
    
    // CLICK ON THE REGISTER BBUTTON METHOD
    
    public void Click_Register() throws InterruptedException
    {
    
    	Click_Register.click();
    }
    
    //CLICK ON THE LOGIN BUTTON 
    
    public void Click_Login()
    {
    	Click_Login.click();
    	
    }
    
}

