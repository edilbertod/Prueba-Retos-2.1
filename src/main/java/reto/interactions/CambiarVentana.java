package reto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CambiarVentana implements Interaction {

    public static CambiarVentana ventana(){
        return new CambiarVentana();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> theWindow = driver.getWindowHandles();
        for (String currWindow:theWindow){
            driver.switchTo().window(currWindow);
        }
    }
}
