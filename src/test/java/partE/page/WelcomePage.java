/*
Created by emman at 7/14/2023 10:58 PM
*/
package partE.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    private WebDriver driver;

    @FindBy(id = "lblLoggedinSuccessfully")
    private WebElement successLoginedMsg;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String successLoginedMsgContent() {
        return successLoginedMsg.getText().trim();
    }
}
