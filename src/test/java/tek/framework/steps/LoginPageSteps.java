package tek.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.framework.pages.HomePage;
import tek.framework.pages.LoginPage;
import tek.framework.utility.SeleniumUtilites;

public class LoginPageSteps extends SeleniumUtilites {

@And("Enter username {string} and password {string}")
public void enterCredentials(String username,String password){
sendText(LoginPage.USERNAME_INPUT,username);
sendText(LoginPage.PASSWORD_INPUT,password);
}
@Then("click on login button")
public void clickOnLoginButton(){
    clickOnElement(LoginPage.LOGIN_BUTTON);
}
@Then("validate account button is displayed")
public void isAccountButtonDisplayed(){
boolean isAccountButtonDisplayed=isElementDisplayed(HomePage.ACCOUNT_BUTTON);
Assert.assertTrue("Account Buton Should Be Displayed",isAccountButtonDisplayed);
    }
}




