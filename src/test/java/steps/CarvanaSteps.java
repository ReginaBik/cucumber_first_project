package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CarvanaCarFinderPage;
import pages.CarvanaHomePage;
import utils.Driver;
import utils.Waiter;

public class CarvanaSteps {
    WebDriver driver;
    CarvanaHomePage carvanaHomePage;
    CarvanaCarFinderPage carvanaCarFinderPage;

    @Before
    public void setup(){
        driver = Driver.getDriver();
        carvanaHomePage = new CarvanaHomePage();
        carvanaCarFinderPage = new CarvanaCarFinderPage();
    }

    @Given("user is on {string}")
    public void userIsOn(String url) {
    }

    @When("user clicks on {string} menu item")
    public void userClicksOnMenuItem(String itemText) {
        carvanaHomePage.clickOnHeaderMenuItems(itemText);
        Waiter.pause(3);
    }


    @Then("user should be navigated to {string}")
    public void userShouldBeNavigatedTo(String url) {

    }

    @And("user should see {string} text")
    public void userShouldSeeText(String headerH3) {
        Assert.assertTrue(carvanaCarFinderPage.h3Header.isDisplayed());
        Assert.assertEquals(headerH3, carvanaCarFinderPage.h3Header.getText());

    }

    @And("user should see {string} link")
    public void userShouldSeeLink(String arg0) {
    }

    @When("user clicks on {string} link")
    public void userClicksOnLink(String arg0) {
    }
}
