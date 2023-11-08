package co.com.retotecnico.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Limpiar implements Interaction {
    private Target input;

    public Limpiar(Target input) {
        this.input = input;
    }

    public static Limpiar campo(Target input) {
        return instrumented(Limpiar.class, input);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(input, isClickable()).forNoMoreThan(30).seconds());
        int longitud = input.resolveFor(actor).getValue().length();
        for (int i = 0; i < longitud; i++) {
            input.resolveFor(actor).sendKeys(Keys.BACK_SPACE);
            input.resolveFor(actor).sendKeys(Keys.BACK_SPACE);
            input.resolveFor(actor).sendKeys(Keys.BACK_SPACE);
            input.resolveFor(actor).sendKeys(Keys.BACK_SPACE);
            actor.attemptsTo(Esperar.unTiempo(3000));
        }
    }
}
