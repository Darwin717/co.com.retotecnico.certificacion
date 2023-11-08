package co.com.retotecnico.certificacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeRegistro {


    public static final Target JOIN_TODAY =Target.the("btn Join today").located(By.xpath("(//*[contains(.,'Join Today')])[12]"));
    public static final Target INPUT_NOMBRE =Target.the("input nombre").located(By.id("firstName"));
    public static final Target INPUT_APELLIDO =Target.the("input apellido").located(By.id("lastName"));
    public static final Target INPUT_CORREO =Target.the("input email").located(By.id("email"));
    public static final Target DESPLEGAR_LISTA_DE_MES =Target.the("desplegar lista de meses").located(By.id("birthMonth"));
    public static final Target MES_DE_LA_LISTA =Target.the("seleccionar mes").locatedBy("//option[contains(.,'{0}')]");
    public static final Target DESPLEGAR_LISTA_DE_DIAS =Target.the("desplegar lista de dias").located(By.id("birthDay"));
    public static final Target DIA_DE_LA_LISTA =Target.the("seleccionar dia").locatedBy("(//option[contains(.,'{0}')])[1]");
    public static final Target DESPLEGAR_LISTA_DE_ANIOS =Target.the("desplegar lista de anios").located(By.id("birthYear"));
    public static final Target ANIO_DE_LA_LISTA =Target.the("seleccionar anio").locatedBy("(//option[contains(.,'{0}')])[1]");
    public static final Target BTN_NEXT_LOCATION_SIGUIENTE =Target.the("btn siguiente").located(By.xpath("//*[@class='btn btn-blue']"));

}