package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashboardTest {

	WebDriver driver;

	@BeforeClass
    public void setUp() throws InterruptedException {
       
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://business.openinapp.com/");
        Thread.sleep(3000);
    }
	@Test(enabled= true)
    public void testSignUp() throws InterruptedException {
		
	    driver.findElement(By.xpath("//p[@class='framer-text'][normalize-space()='Login']")).click();
	  
	   driver.findElement(By.xpath("//input[@placeholder='Eg. john@gmail.com']")).sendKeys("ankitabhoyarst@gmail.com");
	   driver.findElement(By.xpath("//button[@type='submit']//div[@class='flex items-center justify-center w-full gap-2']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@placeholder='********']")).sendKeys("Ankita@2930");
	   driver.findElement(By.xpath("//div[@class='flex items-center justify-center w-full gap-2']")).click();
	   
	        
	  }
    @Test(enabled=true)
    public Void Homepage() {
    	
    	driver.findElement(By.xpath("//p[normalize-space()='brands']")).click();
    	
    	driver.findElement(By.xpath("//p[normalize-space()='campaigns']")).click();
    	
    	driver.findElement(By.xpath("//a[@href='/creators']//div[contains(@class,'flex items-center justify-between gap-3 px-4 py-2 cursor-pointer rounded-lg hover:bg-primaryFade')]")).click();
    	
    	driver.findElement(By.xpath("//a[@href='/links']//div[contains(@class,'flex items-center justify-between gap-3 px-4 py-2 cursor-pointer rounded-lg hover:bg-primaryFade')]")).click();
    	
    	driver.findElement(By.xpath("//p[@class='text-sm font-semibold leading-6 text-center']")).click();
    	
    	driver.findElement(By.xpath("//button[@fdprocessedid='aazkb']")).click();
    	
    	driver.findElement(By.xpath("//div[contains(@class,'bg-primaryFade text-primary flex items-center justify-between gap-3 px-4 py-2 cursor-pointer rounded-lg hover:bg-primaryFade')]")).click();
    	
    	return null;
    	
    }
    
    @AfterClass
    public void tearDown() {
    
        if (driver != null) {
            driver.quit();
        }
    }
}
