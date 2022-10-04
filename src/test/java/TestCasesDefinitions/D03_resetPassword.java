package TestCasesDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import E_CommercePages.Login;
import E_CommercePages.Registration;
import E_CommercePages.ResetPassword;
import org.testng.Assert;

import java.time.Duration;

import static TestCasesDefinitions.Hooks.driver;

public class D03_resetPassword {
    // Defining nopCommerce pages.
    Registration register = new Registration();
    Login login = new Login();
    ResetPassword resetPassword = new ResetPassword();

    @And("user navigates to forget password webpage.")
    public void user_navigates_to_forget_password_webpage() {
        driver.navigate().to(resetPassword.resetPasswordURL());
    }

    @When("user enters a valid email address.")
    public void user_enters_a_valid_email_address() {
        login.loginEmailTxtFld().sendKeys(register.registerEmail());
    }

    @And("user press on recover button.")
    public void user_press_on_recover_button() {
        resetPassword.recoverPasswordButton().click();
    }

    @Then("user could reset password successfully.")
    public void user_could_reset_password_successfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = resetPassword.resetPasswordSuccessTxt().getText();
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #5 | Reset Password Valid Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);

    }

    @When("user enters an invalid email address.")
    public void user_enters_an_invalid_email_address() {
        login.loginEmailTxtFld().sendKeys(login.invalidLoginEmail());
    }

    @Then("user should not be able to reset password.")
    public void user_should_not_be_able_to_reset_password() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = resetPassword.emailNotFoundBarNotif().getText();
        String expectedResult = "Email not found.";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #6 | Reset Password Invalid Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);

    }
}
