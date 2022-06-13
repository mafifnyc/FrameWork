package pageobjectstests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.AmazonHomePage;


public class AmazonHomePageTest extends BrowserDriver {
    AmazonHomePage homePage = null;

    @BeforeMethod
    public void initializeElements() {
        homePage = PageFactory.initElements(driver, AmazonHomePage.class);
    }

    @Test
    public void signIngTest() {
        homePage.clickOnSignIn();
        homePage.clickEmailBox();
        homePage.continueForward();
        String headerText = driver.findElement(By.xpath("//h4[contains(text(),'There was a problem')]")).getText();
        Assert.assertEquals(headerText, "There was a problem");
    }
}
