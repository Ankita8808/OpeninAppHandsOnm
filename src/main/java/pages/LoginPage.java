package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
      
	
	WebDriver driver;

    By loginButton = By.xpath("//p[@class='framer-text'][normalize-space()='Login']");
    By emailField = By.xpath("//input[@placeholder='Eg. john@gmail.com']");
    By submitButton = By.xpath("//button[@type='submit']//div[@class='flex items-center justify-center w-full gap-2']");
    By passwordField = By.xpath("//input[@placeholder='********']");
    By signInButton = By.xpath("//div[@class='flex items-center justify-center w-full gap-2']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }
}

