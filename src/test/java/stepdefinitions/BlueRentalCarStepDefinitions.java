package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.BlueRentalCarPage;
import utulities.Driver;

import java.security.Key;

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
        //Driver.waitAndSendText(blueRentalCarPage.email,string,10);

    }
    @When("user {string} girer")
    public void user_girer(String string) {
       // blueRentalCarPage= new BlueRentalCarPage();
        blueRentalCarPage.password.sendKeys(string);

    }
    @When("login butonuna basar")
    public void login_butonuna_basar() {
        //blueRentalCarPage= new BlueRentalCarPage();
        blueRentalCarPage.loginButton2.click();

    }
    @Then("login islemi gerceklesir")
    public void login_islemi_gerceklesir() {

    }


}
