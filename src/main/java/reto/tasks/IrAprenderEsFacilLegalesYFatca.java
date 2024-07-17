package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.userinterface.AprenderEsFacilLegalesFatca;

public class IrAprenderEsFacilLegalesYFatca implements Task {
    public static IrAprenderEsFacilLegalesYFatca irAprenderEsFacilLegalesYFatca(){
        return Tasks.instrumented(IrAprenderEsFacilLegalesYFatca.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on (AprenderEsFacilLegalesFatca.BTN_POPUP),
                Click.on(AprenderEsFacilLegalesFatca.BTN_APRENDER),
                Click.on (AprenderEsFacilLegalesFatca.BTN_POPUP),
                Click.on(AprenderEsFacilLegalesFatca.BTN_LEGALES),
                Click.on (AprenderEsFacilLegalesFatca.BTN_POPUP),
                Click.on(AprenderEsFacilLegalesFatca.BTN_FATCA),
                Click.on (AprenderEsFacilLegalesFatca.BTN_POPUP)

        );
    }
}
