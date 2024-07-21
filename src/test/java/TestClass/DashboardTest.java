package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.HomePage;

public class DashboardTest {
       
	
	WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://business.openinapp.com/");
        Thread.sleep(3000);
        
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test(enabled = true)
    public void testSignUp() throws InterruptedException {
        loginPage.clickLogin();
        loginPage.enterEmail("ankitabhoyarst@gmail.com");
        loginPage.clickSubmit();
        Thread.sleep(2000);
        loginPage.enterPassword("Ankita@2930");
        loginPage.clickSignIn();
    }

    @Test(enabled = true)
    public void testHomepage() {
        homePage.clickBrands();
        homePage.clickCampaigns();
        homePage.clickCreators();
        homePage.clickLinks();
        homePage.clickTextCenter();
        homePage.clickButton();
        homePage.clickPrimaryFade();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
