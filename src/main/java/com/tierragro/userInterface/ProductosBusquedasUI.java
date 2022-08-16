package com.tierragro.userInterface;
import net.serenitybdd.screenplay.targets.Target;
public class ProductosBusquedasUI {

    public final Target TXT_BARRA_TIERRAGRO = Target
            .the("Barra de busqueda de tierragro")
            .locatedBy("//input[@class=\'earch-bar__input\']");

    public final Target LBL_COMIDA_PARA_PERROS= Target.the("comida para perros")
            .locatedBy("(//a[@class=\"product-item__title text--strong link\"])[1]");

    public final Target LBL_TIERRA_MOJADA= Target.the("tierra mojada")
            .locatedBy("//h1[@class=\"product-meta__title heading h1\"]");

    public final Target LBL_HUMUS=Target.the("humus")
            .locatedBy("//h1[@class=\"product-meta__title heading h1\"]"); //no se clikea

    public final Target LBL_ALIMENTO_PARA_GATO = Target.the("alimeto para gato")
            .locatedBy("(//a[@class=\"product-item__title text--strong link\"])[1]");

    public final Target TXT_pop_apk = Target.the("pop_apk")
            .locatedBy("//img[@class=\"header__logo-image\"]");
}


