package steps;

import funcoes.SiteGoogle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {

    SiteGoogle siteGoogle;

    public TestSteps(){
        siteGoogle = new SiteGoogle();
    }
    @Given("abro URL google")
    public void abro_url_google() {
        siteGoogle.abrir();
    }
    @When("pesquiso {string}")
    public void pesquiso(String string) {
        siteGoogle.abrir();
    }
    @Then("verifico resultado {string} pesquisado")
    public void verifico_resultado_pesquisado(String string) {
        siteGoogle.abrir();
    }
}
