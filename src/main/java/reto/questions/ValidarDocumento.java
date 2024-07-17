package reto.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ValidarDocumento implements Question<Boolean> {

    public static ValidarDocumento toThe (){
        return new ValidarDocumento();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultado = false;
        String tituloDocumento = "Fatca";

        String DocumentoUrlTitle = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();

        if (DocumentoUrlTitle.contains(tituloDocumento)) {
            resultado = true;
        }
        return resultado;

    }
}
