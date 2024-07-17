package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import reto.userinterface.UrlBanistmo;

public class AbrirPaginaBanistmo implements Task {
    private UrlBanistmo urlBanistmo;
    public static AbrirPaginaBanistmo urlBanistmo(){
        return Tasks.instrumented(AbrirPaginaBanistmo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(urlBanistmo)
        );
    }
}
