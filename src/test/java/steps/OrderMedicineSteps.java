package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePageObject;
import pages.MedicinePage;

public class OrderMedicineSteps extends BasePageObject {
    MedicinePage medicinePage = new MedicinePage();
    @Given("^User is on tokopedia homepage$")
    public void userIsOnTokopediaHomepage() {
        System.out.println("HOMEPAGE");
    }

    @And("User clicks lihat semua menu")
    public void userClicksLihatSemuaMenu() {
    }

    @And("User selects tokopedia sehat")
    public void userSelectsTokopediaSehat() {
    }

    @And("User selects batuk, flu, demam menu")
    public void userSelectsBatukFluDemamMenu() {
    }

    @And("User selects first product")
    public void userSelectsFirstProduct() {
    }

    @When("User clicks beli button")
    public void userClicksBeliButton() {
    }

    @Then("User is redirected to login page")
    public void userIsRedirectedToLoginPage() {
    }
}
