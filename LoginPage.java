package pomtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

        private final WebDriver driver;

        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        public void login(String username, String password) {
            WebElement usernameInput = driver.findElement(By.id("user-name"));
            WebElement passwordInput = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("login-button"));

            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginButton.click();
        }
        public boolean isLoginPageDisplayed() {
        try {
            WebElement loginButton = driver.findElement(By.id("login-button"));
            return loginButton.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    }


