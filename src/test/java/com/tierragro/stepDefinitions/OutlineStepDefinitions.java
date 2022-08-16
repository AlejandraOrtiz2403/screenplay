package com.tierragro.stepDefinitions;

import com.tierragro.driver.DriverScreenplay;
import com.tierragro.tasks.Busquedas;
import com.tierragro.userInterface.ProductosBusquedasUI;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class OutlineStepDefinitions {
    ProductosBusquedasUI productosBusquedasUI = new ProductosBusquedasUI();
   @Before
   public void before() throws IOException{
       OnStage.setTheStage(new OnlineCast());
   }
    @Given("^que me encuentro en la pagina tierragro(.*)$")
    public void queMeEncuentroEnLaPaginaTierragroHttpsWwwTierragroCom(String url) {
   OnStage.theActorCalled("").can(BrowseTheWeb.with(DriverScreenplay.chromeDrive("https://www.tierragro.com/")));
    }
    @When("^quiero conocer caracteristica de producto(.*)$")
    public void quieroConocerCaracteristicaDeProducto(String producto) {
    OnStage.theActorInTheSpotlight().attemptsTo(Busquedas.enTierragro(producto));
    }
    @Then("^valido precio de (.*)$")
    public void validoPrecio() {
    }
}
