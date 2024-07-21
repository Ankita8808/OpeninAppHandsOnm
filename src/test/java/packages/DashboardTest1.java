package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DashboardTest1 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://business.openinapp.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(enabled= true)
    public void testSignUp() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='framer-text'][normalize-space()='Login']")));
        loginButton.click();

        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Eg. john@gmail.com']")));
        emailField.sendKeys("ankitabhoyarst@gmail.com");

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']//div[@class='flex items-center justify-center w-full gap-2']")));
        submitButton.click();

        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='********']")));
        passwordField.sendKeys("Ankita@2930");

        WebElement loginSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='flex items-center justify-center w-full gap-2']")));
        loginSubmitButton.click();
        
        WebElement brandsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='brands']")));
        brandsButton.click();

        WebElement campaignsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='campaigns']")));
        campaignsButton.click();
        
        

        
    }

    @Test(enabled=true)
    public void Homepage() {
    	
   
    	
        WebElement brandsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='brands']")));
        brandsButton.click();

        WebElement campaignsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='campaigns']")));
        campaignsButton.click();

        WebElement creatorsLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/creators']//div[contains(@class,'flex items-center justify-between gap-3 px-4 py-2 cursor-pointer rounded-lg hover:bg-primaryFade')]")));
        creatorsLink.click();

        WebElement linksLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/links']//div[contains(@class,'flex items-center justify-between gap-3 px-4 py-2 cursor-pointer rounded-lg hover:bg-primaryFade')]")));
        linksLink.click();

        WebElement dashboardTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='text-sm font-semibold leading-6 text-center']")));
        dashboardTitle.click();

        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@fdprocessedid='aazkb']")));
        addButton.click();

        WebElement primaryButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'bg-primaryFade text-primary flex items-center justify-between gap-3 px-4 py-2 cursor-pointer rounded-lg hover:bg-primaryFade')]")));
        primaryButton.click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
