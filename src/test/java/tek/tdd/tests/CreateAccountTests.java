package tek.tdd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.UIBaseClass;
import tek.tdd.utility.DataGenerator;

public class CreateAccountTests extends UIBaseClass {

    @Test
    public void createNewAccountTestPositive() {
        clickOnElement(homePage.signInLink);
        clickOnElement(signInPage.createNewAccountLink);

        String expectedEmail = DataGenerator.generateRandomEmail("Zia");

        signUpPage.fillUpCreateAccountForm("Zia",
                expectedEmail,
                "786@Allah");

        String actualEmail = getElementText(accountProfilePage.accountEmailInfo);

        Assert.assertEquals(actualEmail, expectedEmail,
                "Profile Page should have same email as Created");
    }

    /*
    Story 4.1 (Activity 15 Minute)
    Navigate to Create Account page and Create new Account
    With existing email and validate error message "this email is already exist, please use another email address".
     */
    @Test
    public void createNewAccountWithExistingEmail() {
        clickOnElement(homePage.signInLink);
        clickOnElement(signInPage.createNewAccountLink);

        signUpPage.fillUpCreateAccountForm(
                "Zia",
                "ziamustafa2000@hotmail.com",
                "786@Allah");

        String actualError = getElementText(signUpPage.signUpError);

        Assert.assertEquals(actualError, "this email is already exist, please use another email address",
                "Error Message for Existing Email should match");

    }
}