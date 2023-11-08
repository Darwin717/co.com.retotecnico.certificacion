package co.com.retotecnico.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.retotecnico.certificacion.userInterface.PaginaDeUltimoPaso.VALIDACION_PANTALLA_FINAL_BIENVENIDA;
import static co.com.retotecnico.certificacion.userInterface.PaginaDeUltimoPaso.VALIDACION_PANTALLA_FINAL_RECAPTCHA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidacionCondicional implements Question {

    public static ValidacionCondicional paraElFormulario(){
        return new ValidacionCondicional();
    }

    @Override
    public Object answeredBy(Actor actor) {
        if ( Visibility.of(VALIDACION_PANTALLA_FINAL_BIENVENIDA).viewedBy(actor).asBoolean()) {
            actor.should(seeThat(ElementoEsperado.esVisible(VALIDACION_PANTALLA_FINAL_BIENVENIDA)));
        }else if  (Visibility.of(VALIDACION_PANTALLA_FINAL_RECAPTCHA).viewedBy(actor).asBoolean()) {
            actor.should(seeThat(ElementoEsperado.esVisible(VALIDACION_PANTALLA_FINAL_RECAPTCHA)));
        }
        return true;
    }
}
