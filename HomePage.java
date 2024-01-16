package pomtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {
        private final WebDriver driver;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isProductDisplayed() {
            try {
                WebElement productLabel = driver.findElement(By.className("inventory_item_name"));
                return productLabel.isDisplayed();
            } catch (Exception e) {
                return false;
            }
        }

    public void logout() {
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();

        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();
    }

}
