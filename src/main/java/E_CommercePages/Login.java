package E_CommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    WebDriver driver;

    public String loginPageURL() {
        return "https://demo.nopcommerce.com/login?returnUrl=%2F";
    }

    public WebElement loginEmailTxtFld() {
        By loginEmailTxtFld = By.cssSelector("input[class=\"email\"]");
        return driver.findElement(loginEmailTxtFld);
    }

    public String invalidLoginEmail() {
        return "Test.test@udacity.com";
    }

    public WebElement passwordEmailTxtFld() {
        By passwordEmailTxtFld = By.cssSelector("input[class=\"password\"]");
        return driver.findElement(passwordEmailTxtFld);
    }

    public String invalidLoginPassword() {
        return "Invalidpassword2486";
    }

    public WebElement loginButton() {
        By loginButton = By.cssSelector("button[class=\"button-1 login-button\"]");
        return driver.findElement(loginButton);
    }

    public WebElement loginSuccessTxtFld() {
        By loginSuccessTxtFld = By.cssSelector("a[class=\"ico-logout\"]");
        return driver.findElement(loginSuccessTxtFld);
    }

    public WebElement loginUnSuccessTxtFld() {
        By loginUnSuccessTxtFld = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");
        return driver.findElement(loginUnSuccessTxtFld);
    }


}

