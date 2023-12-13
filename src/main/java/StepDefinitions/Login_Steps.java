package StepDefinitions;


import io.cucumber.java.en.*;

public class Login_Steps {

    @Given("^Metatime sitesine git$")
    public void metatime_sitesine_git() throws Throwable {
        System.out.println("1 ok");
    }

    @And("^mail adresi gir$")
    public void mail_adresi_gir() throws Throwable {
        System.out.println("2 ok");
    }

    @And("^sifre gir$")
    public void sifre_gir() throws Throwable {
        System.out.println("3 ok");
    }

    @When("^login butonuna bas$")
    public void login_butonuna_bas() throws Throwable {
        System.out.println("4 ok");
    }

    @Then("^Success mesajını doğrula$")
    public void success_mesajını_doğrula() throws Throwable {
        System.out.println("5 ok");
    }
}
