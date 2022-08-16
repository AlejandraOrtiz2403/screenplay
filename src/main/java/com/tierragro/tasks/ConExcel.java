package com.tierragro.tasks;

import com.tierragro.userInterface.ProductosBusquedasUI;
import com.tierragro.utils.Excel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ConExcel implements Task {
    ProductosBusquedasUI productosBusquedasUI =new ProductosBusquedasUI();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            leerExcel = Excel.readExcel("reto 2.xlsx","Productos");
        }catch (IOException E){
            E.printStackTrace();
        }
        for (int i=0; i<leerExcel.size(); i++) {
            actor.attemptsTo(
                    Enter.theValue(leerExcel.get(i).get("Buscar")).into(productosBusquedasUI.TXT_BARRA_TIERRAGRO),
                    Enter.keyValues(Keys.ENTER).into(productosBusquedasUI.TXT_BARRA_TIERRAGRO),
                    Clear.field(productosBusquedasUI.TXT_BARRA_TIERRAGRO)

            );
        }

    }
    public static Performable enTierragro(){
        return Instrumented.instanceOf(ConExcel.class).withProperties();
    }
}
