package tek.framework.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tek.framework.pages.HomePage;
import tek.framework.utility.SeleniumUtilites;

public class HomePageSteps extends SeleniumUtilites {

    @Given("open browser and navigate to retail app")
    public void openBrowserAndNavigate(){
    setupBrowser();}

    @Then("Validate Title  on top left corner")
    public void validateTopLeftCorner(){
    String actualTitle=getElementText(HomePage.HOME_PAGE_TITLE);
    //Assertion in Cucumber using Junit Assertion.
    // Assertion is used to validate pass/fail the test.
    Assert.assertEquals("TEKSCHOOL",actualTitle);}

    @Then("quite browser")
    public void closeBrowser(){
    quiteBrowser();}

    @Then("Validate sign in button is enable")
    public void validateSignInButtonIsEnable(){
    boolean isSignInEnable=isElementEnable(HomePage.SIGN_IN_BUTTON);
    //Assert true checking result of boolean or condition is true
    Assert.assertTrue(isSignInEnable);
    }
    @When("click on sign in button")
    public void clickOnSignInButton(){
    clickOnElement(HomePage.SIGN_IN_BUTTON);
    }




}
