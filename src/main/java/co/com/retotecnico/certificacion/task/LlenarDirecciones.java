package co.com.retotecnico.certificacion.task;

import co.com.retotecnico.certificacion.interactions.Esperar;
import co.com.retotecnico.certificacion.interactions.Limpiar;
import co.com.retotecnico.certificacion.models.CrearDatosPersonales;
import co.com.retotecnico.certificacion.models.DatosPersonalesBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.retotecnico.certificacion.userInterface.PaginaDeDireccion.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class LlenarDirecciones implements Task {

    public final CrearDatosPersonales crearDatosPersonales;

    public LlenarDirecciones(CrearDatosPersonales crearDatosPersonales) {
        this.crearDatosPersonales = crearDatosPersonales;
    }

    public static LlenarDirecciones enSegundoPaso(DatosPersonalesBuilder createDatosPersonales){
        return instrumented(LlenarDirecciones.class, createDatosPersonales.build());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_CIUDAD, isClickable()).forNoMoreThan(20).seconds(),
                Enter.theValue(crearDatosPersonales.getCity()).into(INPUT_CIUDAD),
                Esperar.unTiempo(3000),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CIUDAD),
                Hit.the(Keys.ENTER).into(INPUT_CIUDAD),
                Hit.the(Keys.ENTER).into(INPUT_CIUDAD),
                Esperar.unTiempo(3000),
                Limpiar.campo(INPUT_CODIGO_POSTAL),
                Enter.theValue(crearDatosPersonales.getCodPostal()).into(INPUT_CODIGO_POSTAL),
                Click.on(DESPLEGAR_LISTA_DE_PAIS),
                Click.on(SELECCIONAR_PAIS_DE_LISTA.of(crearDatosPersonales.getPais())),
                Click.on(BTN_NEXT_DEVICES));
    }
}