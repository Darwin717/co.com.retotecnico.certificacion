package co.com.retotecnico.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retotecnico.certificacion.userInterface.PaginaDeUltimoPaso.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class CrearClave implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INGRESAR_CLAVE, isClickable()).forNoMoreThan(20).seconds(),
                Enter.theValue("Prueba_123456").into(INGRESAR_CLAVE),
                Enter.theValue("Prueba_123456").into(INGRESAR_CONFIRMACION_DE_CLAVE),
                Click.on(ESTAR_INFORMADO),
                Click.on(ACEPTAR_TERMINOS),
                Click.on(ACEPTAR_TERMINOS_DE_PRIVACIDAD),
                Click.on(BTN_COMPLETE_SETUP));
    }

    public static CrearClave enCuartoPaso(){
        return Tasks.instrumented(CrearClave.class);
    }
}
