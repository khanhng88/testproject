/*
Created by emman at 7/14/2023 10:15 PM
*/
package partE.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import partE.data.UserCreds;
import partE.testdata.URL;
import partE.testflows.LoginFlow;

public class LoginTest extends BaseTest{

    @Test()
    public void verifyLogin() throws InterruptedException {
        System.out.println("=======using Driver" + getWebDriver().toString());
        goTo(URL.LOGIN_PAGE);

//        LoginFlow loginFlow = new LoginFlow(getWebDriver());
//        loginFlow.loginWithCred(userCreds);
//
//        loginFlow.verifyLoginWithExistingCred();
//
//        if(userCreds.isExisted()) {
//            loginFlow.verifyLoginWithExistingCred();
//
//        }else {
//            loginFlow.verifyLoginWithNonExistedCred();
//        }

        Thread.sleep(1500);
    }

    @Test()
    public void testGoogle() {
        System.out.println("using " + getWebDriver().toString());
        getWebDriver().get("https://www.google.com/");
    }

//    @Test (dataProvider = "credData")
//    public void verifyLogin2(UserCreds userCreds) throws InterruptedException {
//        goTo(URL.LOGIN_PAGE);
//
//        LoginFlow loginFlow = new LoginFlow(getWebDriver());
//        loginFlow.loginWithCred(userCreds);
//
//        if(userCreds.isExisted()) {
//            loginFlow.verifyLoginWithExistingCred();
//
//        }else {
//            loginFlow.verifyLoginWithNonExistedCred();
//        }
//
//    }


    @DataProvider (name = "credData")
    public UserCreds[] credData() {
        return new UserCreds[]{
                new UserCreds("tomsmith", "SuperSecretPassword!", true),
                new UserCreds("invalid@mail.com", "invalidPass", false)
        };
    }
}
