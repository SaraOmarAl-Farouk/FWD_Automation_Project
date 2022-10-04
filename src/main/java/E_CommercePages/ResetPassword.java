package E_CommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPassword {
    WebDriver driver;

    public String resetPasswordURL() {
        return "https://demo.nopcommerce.com/passwordrecovery";
    }

    public WebElement recoverPasswordButton() {
        By recoverPasswordButton = By.cssSelector("button[class=\"button-1 password-recovery-button\"]");
        return driver.findElement(recoverPasswordButton);
    }

    public WebElement resetPasswordSuccessTxt() {
        By resetPasswordSuccessTxt = By.cssSelector("p[class=\"content\"]");
        return driver.findElement(resetPasswordSuccessTxt);
    }

    public WebElement emailNotFoundBarNotif() {
        By emailNotFoundBarNotif = By.cssSelector("div[class=\"bar-notification error\"] > p[class=\"content\"]");
        return driver.findElement(emailNotFoundBarNotif);
    }
}
