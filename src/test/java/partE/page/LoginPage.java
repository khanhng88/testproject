/*
Created by emman at 7/14/2023 9:41 PM
*/
package partE.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "username")
    public WebElement textEmail;
    @FindBy(id = "password")
    public WebElement textPass;
    @FindBy( css = "[type='submit']")
    public WebElement btnLogin;
    @FindBy(id = "lblPasswordErr")
    private WebElement errorPasswordMsg;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String errorMsgContent() {
        return errorPasswordMsg.getText().trim();
    }
}
