package co.com.retotecnico.certificacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeUltimoPaso {


    public static final Target INGRESAR_CLAVE =Target.the("ingresar clave").located(By.id("password"));
    public static final Target INGRESAR_CONFIRMACION_DE_CLAVE =Target.the("Confirmar clave").located(By.id("confirmPassword"));
    public static final Target ESTAR_INFORMADO =Target.the("check mantenerme informado").locatedBy("(//*[contains(.,'STAY INFORMED!')])[14]");
    public static final Target ACEPTAR_TERMINOS =Target.the("Aceptar terminos").locatedBy("(//*[@class='checkmark signup-consent__checkbox error'])[1]");
    public static final Target ACEPTAR_TERMINOS_DE_PRIVACIDAD =Target.the("Aceptar terminos de privacidad").locatedBy("(//*[@class='checkmark signup-consent__checkbox error'])[1]");
    public static final Target BTN_COMPLETE_SETUP =Target.the("Terminar formulario").locatedBy("(//*[contains(.,'Complete Setup')])[14]");
    public static final Target VALIDACION_PANTALLA_FINAL_RECAPTCHA =Target.the("recaptcha para validacion de formulario").locatedBy("(//*[contains(.,'Selecciona todos los cuadros con')])[8]");
    public static final Target VALIDACION_PANTALLA_FINAL_BIENVENIDA =Target.the("validacion de formulario").locatedBy("//*[@class='image-box-header']");



}