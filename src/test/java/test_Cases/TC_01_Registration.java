package test_Cases;

import org.testng.annotations.Test;
import pageObject.Registration_Page;
import test_Base.Base_Class;

public class TC_01_Registration extends Base_Class {

    @Test
    public void testAccountRegistration() throws InterruptedException
    
    {
        

        Registration_Page doRegistration = new Registration_Page(driver);
        doRegistration.setFirstName("Divyanshu");
        doRegistration.setLastName("Priyadarshi");
        doRegistration.setEmail("divyanshuyout@yopmail.com");
        doRegistration.setPassword("Qwerty@123");
        doRegistration.selectSubscribe();
        doRegistration.selectAgree();
        doRegistration.selectContinue();
    }

   
}