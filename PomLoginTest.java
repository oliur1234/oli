package PomTests;

import Generic.Drivers.Driver_Manager;
import PomPages.PomLoginPage;
import Util.base.Base_Config;
import com.qa.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class PomLoginTest {

    PomLoginPage loginPage;
    WebDriver driver;

    // public PomLoginTest() {super();


    @BeforeTest
    public void setup() throws IOException {
        driver = new Driver_Manager().getDriver("Chrome");
        loginPage = new PomLoginPage(driver);
    }

    @Test(priority = 0)
    public void clickOnRegisterButton() {
        loginPage.SignInRegister();
    }

    @Test(priority = 1)
    public void sendUserName() throws IOException {
        loginPage.UserName(Base_Config.getConfig("username"));
    }

    @Test(priority = 2)
    public void sendUserPassword() throws IOException {
        loginPage.Password(Base_Config.getConfig("password"));
    }

    @Test(priority = 3)
    public void clickSignIn() {
        loginPage.SignIn();
    }

    @Test(priority = 4)
    public void mouseHover() throws InterruptedException {
        loginPage.setMouseH();
    }
}




//    public class BrowserStackSetup {
//        String driverPath = "C:\\geckodriver.exe";
//        WebDriver driver;
//        BrowserStackHomePage objBrowserStackHomePage;
//        BrowserStackSignUpPage objBrowserStackSignUpPage;
//
//        @BeforeTest
//        public void setup() {
//            System.setProperty("webdriver.chrome.driver", "C:\\BrowserStack\\chromedriver.exe");
//            driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.get("https://www.browserstack.com/");
//        }
//
//        @Test(priority = 1)
//        public void navigate_to_homepage_click_on_getstarted() {
//           - objBrowserStackHomePage = new BrowserStackHomePage(driver);
//            objBrowserStackHomePage.veryHeader();
//            objBrowserStackHomePage.clickOnGetStarted();
//        }
//
//        @Test(priority = 2)
//        public void enter_userDetails() {
//            objBrowserStackSignUpPage = new BrowserStackSignUpPage(driver);
//            objBrowserStackSignUpPage.veryHeader();
//            objBrowserStackSignUpPage.enterFullName("TestUser");
//            objBrowserStackSignUpPage.enterBusinessEmail("TestUser@gmail.com");
//            objBrowserStackSignUpPage.enterPasswrod("TestUserPassword");
//        }
//    }
