package co.com.retotecnico.certificacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeDireccion {


    public static final Target INPUT_CIUDAD =Target.the("input ciudad").located(By.id("city"));
    public static final Target INPUT_CODIGO_POSTAL =Target.the("input codigo postal").located(By.id("zip"));
    public static final Target DESPLEGAR_LISTA_DE_PAIS =Target.the("input pais").located(By.xpath("//*[@name='countryId']"));
    public static final Target SELECCIONAR_PAIS_DE_LISTA =Target.the("seleccionar un pais").locatedBy("//*[contains(@class,'ui-select-choices-row-inner') and contains(.,'{0}')]");
    public static final Target BTN_NEXT_DEVICES =Target.the("btn continuar a devices").located(By.xpath("(//*[contains(.,'Next: Devices')])[15]"));

}