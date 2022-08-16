package com.tierragro.tasks;
import com.tierragro.interactions.ClickRandom;
import com.tierragro.userInterface.ClickRandomUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


import java.util.Random;

public class ClickRandomTask implements Task{
    ClickRandomUI clickRandomUI = new ClickRandomUI();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(clickRandomUI.BTN_X, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(clickRandomUI.BTN_X),
                WaitUntil.the(clickRandomUI.BTN_GATO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(clickRandomUI.BTN_GATO),
                WaitUntil.the(clickRandomUI.BTN_PRODUCTO_ALEATORIO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(clickRandomUI.BTN_PRODUCTO_ALEATORIO),
                ClickRandom.EncategoriaGato()
        );

        }
    public static Performable enTierragro(){
        return Instrumented.instanceOf(ClickRandomTask.class).withProperties();
    }

    }

