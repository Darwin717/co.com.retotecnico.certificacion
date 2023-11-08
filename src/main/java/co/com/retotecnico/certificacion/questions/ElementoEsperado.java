package co.com.retotecnico.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;


public class ElementoEsperado implements Question<Boolean> {

    Target elemento;

    public ElementoEsperado(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(elemento).viewedBy(actor).asBoolean();
    }

    public static ElementoEsperado esVisible(Target elemento){
        return new ElementoEsperado(elemento);
    }
}