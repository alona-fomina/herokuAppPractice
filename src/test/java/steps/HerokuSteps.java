package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.ActionsUtil;
import utils.ValidationUtils;
import utils.Waiter;

public class HerokuSteps {
    @Then("user clicks on {string} link")
    public void userClicksOnLink(String LinkText) {
        Hooks.herokuHomePage.clickOnHomePageText(LinkText);
    }

    @And("user should be able to see an image")
    public void userShouldBeAbleToSeeAnImage() {
        System.out.println(ValidationUtils.isImageActive(Hooks.herokuPage.image1));
        System.out.println(ValidationUtils.isImageActive(Hooks.herokuPage.image2));
        System.out.println(ValidationUtils.isImageActive(Hooks.herokuPage.image3));

        Assert.assertFalse(ValidationUtils.isImageActive(Hooks.herokuPage.image1));
        Assert.assertFalse(ValidationUtils.isImageActive(Hooks.herokuPage.image2));
        Assert.assertTrue(ValidationUtils.isImageActive(Hooks.herokuPage.image3));

    }

    @Then("user clicks on {string} linkText")
    public void userClicksOnLinkText(String link) {
        Hooks.herokuHomePage.clickOnHomePageText(link);
    }

    @Then("user validates view profile link and names are not displayed")
    public void userValidatesViewProfileLinkAndNamesAreNotDisplayed() {
        for (WebElement header : Hooks.herokuPage.nameHeaders) {
            Assert.assertFalse(header.isDisplayed());
        }
        for (WebElement links : Hooks.herokuPage.nameLinks) {
            Assert.assertFalse(links.isDisplayed());
        }
    }

    @And("user hover over image and validates link and text")
    public void userHoverOverImageAndValidatesLinkAndText() throws InterruptedException {
        for (int i = 0; i < Hooks.herokuPage.avatarImages.size(); i++) {
            Thread.sleep(3000);
            ActionsUtil.moveToElement(Hooks.herokuPage.avatarImages.get(i));
            Assert.assertTrue(Hooks.herokuPage.nameHeaders.get(i).isDisplayed());
            Assert.assertTrue(Hooks.herokuPage.nameLinks.get(i).isDisplayed());
            Assert.assertTrue(Hooks.herokuPage.nameLinks.get(i).isEnabled());
        }
    }
}
