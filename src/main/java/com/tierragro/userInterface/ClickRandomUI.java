package com.tierragro.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ClickRandomUI {
    public final Target BTN_GATO= Target.the("boton categoria gatos")
            .locatedBy("( //a [@href='/collections/gatos'])[2]");
    public final Target LBL_PRODUCTO_ALEATORIO= Target.the("titulo producto")
            .locatedBy("//a[@class='product-item__title text--strong link']");

    public final Target BTN_PRODUCTO_ALEATORIO= Target.the("boton producto")
            .locatedBy("//div [@class='product-item completeItem product-item--vertical "+
                    " 1/3--tablet-and-up 1/4--desk']");
    public final Target BTN_X= Target.the("boton x")
            .locatedBy("//i[@class='far fa-times close triggerClose']");


}

