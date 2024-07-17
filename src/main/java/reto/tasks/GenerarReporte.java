package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.interactions.CambiarVentana;
import reto.userinterface.Reporte;

public class GenerarReporte implements Task {
    public static GenerarReporte seleccionarReporte(){
        return Tasks.instrumented(GenerarReporte.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Reporte.BTN_REPORTE),
                CambiarVentana.ventana()
        );
    }
}
