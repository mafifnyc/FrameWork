package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.ID, using = "exampleInputEmail")
    WebElement inputMail;

    @FindBy(how = How.ID, using = "exampleInputPassword")
    WebElement inputPassword;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    WebElement loginButton;

    public void enterMail() {
        inputMail.click();
        inputMail.sendKeys("mafifnyc");

    }

    public void enterPassword() {
        inputPassword.click();
        inputPassword.sendKeys("123456");
    }

    public void clickLogin() {
        loginButton.click();
    }

}
