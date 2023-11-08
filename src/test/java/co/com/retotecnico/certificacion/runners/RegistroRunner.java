package co.com.retotecnico.certificacion.runners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registroDeUsuarioExitoso.feature",
        glue = "co/com/retotecnico/certificacion/stepDefinitions"
)
public class RegistroRunner {

}
