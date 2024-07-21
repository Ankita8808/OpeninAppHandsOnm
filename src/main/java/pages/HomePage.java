package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;

    By brandsLink = By.xpath("//p[normalize-space()='brands']");
    By campaignsLink = By.xpath("//p[normalize-space()='campaigns']");
    By creatorsLink = By.xpath("//a[@href='/creators']//div[contains(@class,'flex items-center justify-between gap-3 px-4 py-2 cursor-pointer rounded-lg hover:bg-primaryFade')]");
    By linksLink = By.xpath("//a[@href='/links']//div[contains(@class,'flex items-center justify-between gap-3 px-4 py-2 cursor-pointer rounded-lg hover:bg-primaryFade')]");
    By textCenter = By.xpath("//p[@class='text-sm font-semibold leading-6 text-center']");
    By button = By.xpath("//button[@fdprocessedid='aazkb']");
    By primaryFade = By.xpath("//div[contains(@class,'bg-primaryFade text-primary flex items-center justify-between gap-3 px-4 py-2 cursor-pointer rounded-lg hover:bg-primaryFade')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBrands() {
        driver.findElement(brandsLink).click();
    }

    public void clickCampaigns() {
        driver.findElement(campaignsLink).click();
    }

    public void clickCreators() {
        driver.findElement(creatorsLink).click();
    }

    public void clickLinks() {
        driver.findElement(linksLink).click();
    }

    public void clickTextCenter() {
        driver.findElement(textCenter).click();
    }

    public void clickButton() {
        driver.findElement(button).click();
    }

    public void clickPrimaryFade() {
        driver.findElement(primaryFade).click();
    }
}


