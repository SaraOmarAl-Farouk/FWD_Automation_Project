package E_CommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {
    WebDriver driver;

    public String registerPageURL() {
        return "https://demo.nopcommerce.com/register?returnUrl=%2F";
    }

    public String registerPageResultURL() {
        return "https://demo.nopcommerce.com/registerresult/1?returnUrl=/";
    }

    public WebElement femaleCheckBox() {
        By femaleCheckBox = By.id("gender-female");
        return driver.findElement(femaleCheckBox);
    }

    public WebElement firstNameTxtFld() {
        By firstNameTxtFld = By.id("FirstName");
        return driver.findElement(firstNameTxtFld);
    }

    public WebElement lastNameTxtFld() {
        By lastNameTxtFld = By.id("LastName");
        return driver.findElement(lastNameTxtFld);
    }

    public WebElement birthDayScrlPn() {
        By birthDayScrlPn = By.name("DateOfBirthDay");
        return driver.findElement(birthDayScrlPn);
    }

    public WebElement day05() {
        By day05 = By.cssSelector("select[name=\"DateOfBirthDay\"] > option[value=\"05\"]");
        return driver.findElement(day05);
    }

    public WebElement birthMonthScrlPn() {
        By birthMonthScrlPn = By.name("DateOfBirthMonth");
        return driver.findElement(birthMonthScrlPn);
    }

    public WebElement month6() {
        By month6 = By.cssSelector("select[name=\"DateOfBirthMonth\"] > option[value=\"6\"]");
        return driver.findElement(month6);
    }

    public WebElement birthYearScrlPn() {
        By birthYearScrlPn = By.name("DateOfBirthYear");
        return driver.findElement(birthYearScrlPn);
    }

    public WebElement year1993() {
        By year1993 = By.cssSelector("option[value=\"1993\"]");
        return driver.findElement(year1993);
    }

    public WebElement emailAddressTxtFld() {
        By emailAddressTxtFld = By.cssSelector("div[class=\"inputs\"] > input[type=\"email\"]");
        return driver.findElement(emailAddressTxtFld);
    }

    public String registerEmail() {
        return "Ecommercetestingapp@udacity.com";
    }

    public WebElement passwordTxtFld() {
        By passwordTxtFld = By.id("Password");
        return driver.findElement(passwordTxtFld);
    }

    public String registerPassword() {
        return "Sara@2486";
    }

    public WebElement confirmPassTxtFld() {
        By confirmPassTxtFld = By.id("ConfirmPassword");
        return driver.findElement(confirmPassTxtFld);
    }

    public WebElement registerButton() {
        By registerButton = By.cssSelector("button[name=\"register-button\"]");
        return driver.findElement(registerButton);
    }

    public WebElement registrationCompletedMsg() {
        By registrationCompletedMsg = By.cssSelector("div[class=\"result\"]");
        return driver.findElement(registrationCompletedMsg);
    }

    public WebElement passwordErrorMsg() {
        By passwordErrorMsg = By.id("Password-error");
        return driver.findElement(passwordErrorMsg);
    }


}

