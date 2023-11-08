package co.com.retotecnico.certificacion.task;

import co.com.retotecnico.certificacion.models.CrearDatosPersonales;
import co.com.retotecnico.certificacion.models.DatosPersonalesBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Random;

import static co.com.retotecnico.certificacion.userInterface.PaginaDeRegistro.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class LlenarDatosPersonales implements Task {

    public final CrearDatosPersonales crearDatosPersonales;

    public LlenarDatosPersonales(CrearDatosPersonales crearDatosPersonales) {
        this.crearDatosPersonales = crearDatosPersonales;
    }

    public static LlenarDatosPersonales enPrimerPaso(DatosPersonalesBuilder createDatosPersonales){
        return instrumented(LlenarDatosPersonales.class, createDatosPersonales.build());
    }
    Random numAleatorio = new Random();
    int numero = numAleatorio.nextInt(75-2+1) + 3;

    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random = new Random();
        random.nextInt();

        actor.attemptsTo(
                WaitUntil.the(JOIN_TODAY, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(JOIN_TODAY),
                WaitUntil.the(INPUT_NOMBRE, isClickable()).forNoMoreThan(20).seconds(),
                Enter.theValue(crearDatosPersonales.getFirstName()).into(INPUT_NOMBRE),
                Enter.theValue(crearDatosPersonales.getLastName()).into(INPUT_APELLIDO),
//                Enter.theValue(createDatosPersonales.getEmail() +  numero + "@gmail.com").into(INPUT_CORREO),
                Enter.theValue(crearDatosPersonales.getEmail() +  numero + "@gmail.com").into(INPUT_CORREO),
                Click.on(DESPLEGAR_LISTA_DE_MES),
                Click.on(MES_DE_LA_LISTA.of(crearDatosPersonales.getMes())),
                Click.on(DESPLEGAR_LISTA_DE_DIAS),
                Click.on(DIA_DE_LA_LISTA.of(crearDatosPersonales.getDia())),
                Click.on(DESPLEGAR_LISTA_DE_ANIOS),
                Click.on(ANIO_DE_LA_LISTA.of(crearDatosPersonales.getAnio())),
                Click.on(BTN_NEXT_LOCATION_SIGUIENTE));
    }
}
