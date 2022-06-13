package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonHomePage {
    @FindBy(how = How.ID, using = "nav-orders")
    WebElement signInButton;
    @FindBy(how = How.ID, using = "ap_email")
    WebElement inputEmail;

    @FindBy(how = How.ID, using = "continue")
    WebElement cont;

    public void clickOnSignIn() {
        signInButton.click();
    }
    public void clickEmailBox() {
        inputEmail.click();
        inputEmail.sendKeys("johnsmith@blahmail.com");
    }

    public void continueForward() {
        cont.click();
    }
}
