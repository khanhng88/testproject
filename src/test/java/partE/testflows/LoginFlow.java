/*
Created by emman at 7/15/2023 3:32 PM
*/
package partE.testflows;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import partE.data.UserCreds;
import partE.page.LoginPage;
import partE.page.WelcomePage;

public class LoginFlow {

    private WebDriver driver;

    public LoginFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void loginWithCred(UserCreds userCred) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.textEmail.sendKeys(userCred.getEmail());
        loginPage.textPass.sendKeys(userCred.getPassword());
        loginPage.btnLogin.click();
    }

    public void verifyLoginWithExistingCred() {
//        String actualMsg = new WelcomePage(driver).successLoginedMsgContent();
//        String expectedMsg = "You have logged-in successfully!";
//        Assert.assertEquals(expectedMsg, actualMsg);
    }

    public void verifyLoginWithNonExistedCred() {
//        String actualErrorMsg = new LoginPage(driver).errorMsgContent();
//        String expectedErrorMsg = "The inputted email or password is not correct.";
//        Assert.assertEquals(expectedErrorMsg, actualErrorMsg);

    }
}
