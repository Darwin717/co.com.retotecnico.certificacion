package co.com.retotecnico.certificacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeDispositivos {


    public static final Target DESPLEGAR_LISTA_DE_OS =Target.the("Desplegar lista de sistema operativo").located(By.xpath("(//*[@class='ui-select-box'])[1]"));
    public static final Target SELECCIONAR_DE_LISTA_TRANSVERSAL =Target.the("input codigo postal").locatedBy("(//*[contains(@class,'ui-select-choices-row-inner') and contains(.,'{0}')])[1]");
    public static final Target DESPLEGAR_LISTA_DE_VERSION =Target.the("Desplegar lista de version").located(By.xpath("(//*[@class='ui-select-box'])[2]"));
    public static final Target DESPLEGAR_LISTA_DE_LENGUAJE =Target.the("Desplegar lista de lenguaje").located(By.xpath("(//*[@class='ui-select-box'])[3]"));
    public static final Target DESPLEGAR_LISTA_DE_DISPOSITIVO =Target.the("Desplegar lista de dispositivo").located(By.xpath("(//*[@class='ui-select-box'])[4]"));
    public static final Target DESPLEGAR_LISTA_DE_MODELO =Target.the("Desplegar lista de modelos").located(By.xpath("(//*[@class='ui-select-box'])[5]"));
    public static final Target DESPLEGAR_LISTA_DE_SISTEMA_OPERATIVO =Target.the("Desplegar lista de sistema operativo").located(By.xpath("(//*[@class='ui-select-box'])[6]"));
    public static final Target BTN_NEXT_LAST_STEP =Target.the("btn continuar a devices").located(By.xpath("(//*[contains(.,'Next: Last Step')])[14]"));


}