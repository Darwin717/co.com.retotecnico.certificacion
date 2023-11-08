package co.com.retotecnico.certificacion.stepDefinitions;

import co.com.retotecnico.certificacion.interactions.AbrirNavegadorWeb;
import co.com.retotecnico.certificacion.models.DatosPersonalesBuilder;
import co.com.retotecnico.certificacion.questions.ValidacionCondicional;
import co.com.retotecnico.certificacion.task.CrearClave;
import co.com.retotecnico.certificacion.task.LlenarDatosDelDispositivos;
import co.com.retotecnico.certificacion.task.LlenarDatosPersonales;
import co.com.retotecnico.certificacion.task.LlenarDirecciones;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

public class RegistroStep {

    @Dado("^que Darwin quiere abrir la pagina$")
    public void queDarwinQuiereAbrirLaPagina() {
        theActorInTheSpotlight().attemptsTo(AbrirNavegadorWeb.enPagina());
    }

    @Cuando("^el se registra de manera exitosa$")
    public void elSeRegistraDeManeraExitosa(List<Map< String, String>> datos)  {
        theActorInTheSpotlight().attemptsTo(
                LlenarDatosPersonales.enPrimerPaso(DatosPersonalesBuilder.con()
                        .firstName(datos)
                        .lastName(datos)
                        .email(datos)
                        .mes(datos)
                        .dia(datos)
                        .anio(datos)));
        theActorInTheSpotlight().attemptsTo(
                LlenarDirecciones.enSegundoPaso(DatosPersonalesBuilder.con()
                                        .city(datos)
                                                .codPostal(datos)
                                                        .pais(datos)));
        theActorInTheSpotlight().attemptsTo(LlenarDatosDelDispositivos.enTercerPaso(),
                CrearClave.enCuartoPaso());
    }

    @Entonces("^podra visualizar un mensaje de bienvenida$")
    public void podraVisualizarUnMensajeDeBienvenida() {
        theActorInTheSpotlight().should(seeThat(ValidacionCondicional.paraElFormulario()));
    }
}
