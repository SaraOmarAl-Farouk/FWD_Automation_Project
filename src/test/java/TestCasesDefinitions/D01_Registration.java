package TestCasesDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import E_CommercePages.Registration;
import org.testng.Assert;


public class D01_Registration {
    Registration register = new Registration();

    @And("user navigates to registration page.")
    public void user_navigates_to_registration_page() throws InterruptedException {
        Hooks.driver.navigate().to(register.registerPageURL());
        Thread.sleep(2000);
    }

    @And("user press on female checkbox.")
    public void user_press_on_female_checkbox() {
        register.femaleCheckBox().click();
    }


    @And("user enters valid first name.")
    public void user_enters_valid_first_name() {
        register.firstNameTxtFld().sendKeys("Sara");
    }


    @And("user enters valid last name.")
    public void user_enters_valid_last_name() {
        register.lastNameTxtFld().sendKeys("Omar");
    }


    @And("user select valid date of birth.")
    public void user_select_valid_date_of_birth() {
        // Selecting Birth Day & clicking on it.
        register.birthDayScrlPn().click();
        // Selecting 05 as the Birthday day.
        register.day05().click();
        // Selecting Birth Month.
        register.birthMonthScrlPn().click();
        // Selecting 6 as the Birthday Month.
        register.month6().click();
        // Selecting Birth Year & clicking on it.
        register.birthYearScrlPn().click();
        // Selecting 1993 as the Birth Year.
        register.year1993().click();
    }


    @And ("user enters valid email address.")
    public void user_enters_valid_email_address() {
        register.emailAddressTxtFld().sendKeys(register.registerEmail());
    }


    @And ("user enters valid password.")
    public void user_enters_valid_password() {
        register.passwordTxtFld().sendKeys(register.registerPassword());
    }

    @And ("user enters invalid password.")
    public void user_enters_invalid_password() {
        register.passwordTxtFld().sendKeys("123");
    }

    @And ("user reenter valid password.")
    public void user_reenter_valid_password() {
        register.confirmPassTxtFld().sendKeys("Ahmed@1");
    }

    @And ("user reenter invalid password.")
    public void user_reenter_invalid_password() {
        register.confirmPassTxtFld().sendKeys("123");
    }

    @And ("user clicks on register button.")
    public void user_clicks_on_register_button() {
        register.registerButton().click();
    }


    @Then("user could register successfully.")
    public void user_could_register_successfully() {
        String actualResult = register.registrationCompletedMsg().getText();
        String expectedResult = "Your registration completed";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #1 (Registration) | Text Displayed After User Registration Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }


    @Then ("user could not register successfully.")
    public void user_could_not_register_successfully() {
        String actualResult = register.passwordErrorMsg().getText();
        String expectedResult = "Password must meet the following rules:\n" +
                "must have at least 6 characters";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #2 | Invalid Password Comparison: ---");
        System.out.println("** Actual Text Displayed Result = " + actualResult);
        System.out.println("\n** Expected Text Displayed Result = " + expectedResult);
    }


    @And("user returned to register result webpage.")
    public void user_returned_to_register_result_webpage() {
        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult = register.registerPageResultURL();
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #1 (Registration) | Redirected Website After Registration Comparison: ---");
        System.out.println("** Actual Website Redirected to = " + actualResult);
        System.out.println("** Expected Website Redirected to = " + expectedResult);
    }




}

