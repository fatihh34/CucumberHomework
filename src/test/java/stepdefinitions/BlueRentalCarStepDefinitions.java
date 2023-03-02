package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalCarPage;
import utulities.Driver;

public class BlueRentalCarStepDefinitions {
    BlueRentalCarPage blueRentalCarPage = new BlueRentalCarPage();

    @Given("user {string} gider")
    public void user_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
       blueRentalCarPage = new BlueRentalCarPage();
        blueRentalCarPage.loginButton.click();
    }
    @When("user emali {string} girer")
    public void user_emali_girer(String string) {
        blueRentalCarPage= new BlueRentalCarPage();
        blueRentalCarPage.email.sendKeys(string);

    }
    @When("user {string} girer")
    public void user_girer(String string) {
        blueRentalCarPage.password.sendKeys(string);

    }
    @When("login butonuna basar")
    public void login_butonuna_basar() throws InterruptedException {
        blueRentalCarPage.loginButton2.click();
        Thread.sleep(3000);

    }
    @Then("login islemi gerceklesir")
    public void login_islemi_gerceklesir() throws InterruptedException {
      Assert.assertTrue(blueRentalCarPage.loginAssert.isDisplayed());
       Thread.sleep(3000);

    }
    @Then("user logout olur")
    public void user_logout_olur() throws InterruptedException {
        blueRentalCarPage.loginAssert.click();
        blueRentalCarPage.logoutButton.click();
        Thread.sleep(3000);
        blueRentalCarPage.okButton.click();
        Thread.sleep(3000);
    }
}
