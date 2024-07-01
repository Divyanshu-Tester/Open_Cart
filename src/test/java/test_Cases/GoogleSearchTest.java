package test_Cases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest

{
    public WebDriver driver;
  
    
    
    @BeforeClass
    public void setUp() 
    
    {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/Divyanshu Eclipse/Selenium/Chrome Driver/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
    }
    
    @Test
    public void testGoogleSearch() throws InterruptedException 
    {
        // Navigate to Google
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Divyanshu");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("divyanshupriyadarshi1998@gmail.com");
        Thread.sleep(7000);
        
        
        

        
    }

//    public void tearDown() 
//    {
//        if (driver != null) 
//        {
//            driver.quit();
//        }
    
}