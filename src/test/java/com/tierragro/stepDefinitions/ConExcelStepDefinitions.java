package com.tierragro.stepDefinitions;

import com.tierragro.tasks.Busquedas;
import com.tierragro.tasks.ConExcel;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ConExcelStepDefinitions {
    @When("^quiero ver caracteristica de producto$")
    public void quieroVerCaracteristicaDeProducto() {
        OnStage.theActorInTheSpotlight().attemptsTo(ConExcel.enTierragro());
    }

    @Then("^valido precio$")
    public void validoPrecio() {

    }
}
