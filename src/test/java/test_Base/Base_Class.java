package test_Base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class Base_Class 

{
	
public WebDriver driver;
public WebDriverWait wait;


    
    @BeforeClass
    public void setUp() throws InterruptedException 
    
    {
        
        System.setProperty("webdriver.chrome.driver", "/Users/Divyanshu Eclipse/Selenium/Chrome Driver/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    
        
    }

    
    }




