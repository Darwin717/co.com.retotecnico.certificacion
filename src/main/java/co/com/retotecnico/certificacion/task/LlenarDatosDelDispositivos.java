package co.com.retotecnico.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retotecnico.certificacion.userInterface.PaginaDeDispositivos.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class LlenarDatosDelDispositivos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DESPLEGAR_LISTA_DE_OS, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(DESPLEGAR_LISTA_DE_OS),
                Click.on(SELECCIONAR_DE_LISTA_TRANSVERSAL.of("macOS")),
                Click.on(DESPLEGAR_LISTA_DE_VERSION),
                Click.on(SELECCIONAR_DE_LISTA_TRANSVERSAL.of("OS X 10.4")),
                Click.on(DESPLEGAR_LISTA_DE_LENGUAJE),
                Click.on(SELECCIONAR_DE_LISTA_TRANSVERSAL.of("English")),
                Click.on(DESPLEGAR_LISTA_DE_DISPOSITIVO),
                Click.on(SELECCIONAR_DE_LISTA_TRANSVERSAL.of("Alcatel")),
                Click.on(DESPLEGAR_LISTA_DE_MODELO),
                Click.on(SELECCIONAR_DE_LISTA_TRANSVERSAL.of("OT-918")),
                Click.on(DESPLEGAR_LISTA_DE_SISTEMA_OPERATIVO),
                Click.on(SELECCIONAR_DE_LISTA_TRANSVERSAL.of("Android 2.5")),
                Click.on(BTN_NEXT_LAST_STEP));
    }

    public static LlenarDatosDelDispositivos enTercerPaso(){
        return Tasks.instrumented(LlenarDatosDelDispositivos.class);
    }
}
