package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    }
    @When("kullanici adini girer")
    public void kullanici_adini_girer() {

    }
    @When("kullanici sifreyi girer")
    public void kullanici_sifreyi_girer() {
        // Write code here tha
    }
    @When("login butonuna basar")
    public void login_butonuna_basar() {

    }
    @Then("login islemi gerceklesir")
    public void login_islemi_gerceklesir() {

    }


}
