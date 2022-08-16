package com.tierragro.stepDefinitions;

import com.tierragro.tasks.Busquedas;
import com.tierragro.userInterface.ProductosBusquedasUI;
import com.tierragro.utils.Models;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;
import java.util.List;

public class BackgrounStepDefinitions {
    ProductosBusquedasUI productosBusquedasUI = new ProductosBusquedasUI();
    @Before
    public void  before() throws IOException{
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^quiero buscar el producto$")
    public void quieroBuscarElProducto(List<Models>arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(Busquedas.enTierragro(arg1.get(0).getProducto()));
    }

    @Then("^valido producto$")
    public void validoProducto(List<Models> arg1) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion
                .the(productosBusquedasUI.LBL_TIERRA_MOJADA.of()), WebElementStateMatchers
                .containsText(arg1.get(0).getValidar())));
    }
}
