package com.tierragro.tasks;

import com.tierragro.userInterface.ProductosBusquedasUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Busquedas implements Task{
    private static String TXT_BARRA_tierragro;

   ProductosBusquedasUI productosBusquedasUI =new ProductosBusquedasUI();
    private String producto;
    public Busquedas(String producto) {

        this.producto = producto;
   }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(productosBusquedasUI.TXT_pop_apk,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(productosBusquedasUI.TXT_pop_apk),
                Enter.theValue(producto).into(productosBusquedasUI.TXT_BARRA_TIERRAGRO),
                Enter.keyValues(Keys.ENTER).into(productosBusquedasUI.TXT_BARRA_TIERRAGRO)


    );
}
    public static Performable enTierragro(String producto){
        return Instrumented.instanceOf(Busquedas.class).withProperties(producto);
    }

}
