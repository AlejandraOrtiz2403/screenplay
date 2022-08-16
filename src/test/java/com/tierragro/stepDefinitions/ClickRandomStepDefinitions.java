package com.tierragro.stepDefinitions;

import com.tierragro.tasks.ClickRandomTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class ClickRandomStepDefinitions {
    @Before
    public void  before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^quiero entrar en la tienda y comprar producto$")
    public void quieroEntrarEnLaTiendaYComprarProducto() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickRandomTask.enTierragro());
    }


    @Then("^selecciono una lista de producto$")
    public void seleccionoUnaListaDeProducto() {

    }


}
