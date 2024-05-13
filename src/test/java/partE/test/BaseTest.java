/*
Created by emman at 7/14/2023 11:43 PM
*/
package partE.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import partE.drivers.DriverFactory;
import partE.testdata.URL;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BaseTest {
//    private ThreadLocal<DriverFactory> threadLocal;
    private ThreadLocal<DriverFactory> threadLocal;
    //cung cap 1 driverFactory cho 1 thread
    private List<DriverFactory> driverPool = Collections.synchronizedList(new ArrayList<>());
    //strategy: Minh muon isolate cac thread rieng biet, va ko bi conflict giua cac threads voi nhau khi run parallel
    //voi moi thread minh se cap 1 resource Driver factory
    //voi resource DriverFactory thi Thread se tu handle lay, ko conflict session/thread khac
    //1 thoi diem chi co 1 resource access vao list

    @BeforeClass(alwaysRun = true)
    public void initDriver() {

        threadLocal = ThreadLocal.withInitial(() -> {
           DriverFactory driverFactory = new DriverFactory();
           driverPool.add(driverFactory);
           return driverFactory;
        });
        System.out.println("Before class provide a thread for each class test: "+ threadLocal.toString());
    }
    @BeforeMethod
    public void showThread() {
        System.out.println("Current thread: " + threadLocal.toString());
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        threadLocal.get().quitDriver();
        //lay dung cai driver session tu cai related thread de quit
    };

    public WebDriver getWebDriver() {

//        return threadLocal.get().getDriver();
        return threadLocal.get().getDriver();
        //lay dung cai driver session tu cai thread specific
    }
    public void goTo(URL path) {getWebDriver().get("https://the-internet.herokuapp.com" + path.getPath());
    }
}
