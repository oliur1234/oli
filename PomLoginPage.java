package PomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PomLoginPage {

    WebDriver driver;
    By signInRegister = By.xpath("//a[@id='header_sign_in']");
    By userName = By.xpath("//input[@id='signInName']");
    By password = By.xpath("//input[@id='password']");
    By signIn = By.xpath("//button[@id='next']");
    By mouseH = By.id("createAccount");

    By newMouseH = By.id("Home_Ancillary_0");

    public PomLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void SignInRegister() {
        driver.findElement(signInRegister).click();
    }
    public void UserName(String username) {
        driver.findElement(userName).sendKeys(username);
    }
    public void Password(String Password) {
        driver.findElement(password).sendKeys(Password);
    }
    public void SignIn() {
        driver.findElement(signIn).click();
    }
    public void setMouseH() throws InterruptedException {
        Thread.sleep(4000);
        WebElement elementToHover = driver.findElement(mouseH);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).perform();
    }
}
