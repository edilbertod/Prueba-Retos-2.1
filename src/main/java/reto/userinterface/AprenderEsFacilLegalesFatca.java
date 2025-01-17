package reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AprenderEsFacilLegalesFatca extends PageObject {
    public static final Target BTN_APRENDER = Target.the("Boton Aprender es Facil").located(By.xpath("//a[@href='/wps/portal/banistmo/personas/aprender-es-facil' and contains(text(),'Aprender es fácil')]"));
    public static final Target BTN_LEGALES = Target.the("Boton Legales").located(By.xpath("//a[@href='/wps/portal/banistmo/personas/aprender-es-facil/legales']"));
    public static final Target BTN_FATCA = Target.the("Boton FATCA & CRS").located(By.xpath("//a[@href='/wps/portal/banistmo/personas/aprender-es-facil/legales/fatca' and @Title='ENSA']"));
    public static final Target BTN_POPUP = Target.the("Boton Cerrar PopUp").located(By.xpath("//div[@id='cookie-close-btn']"));

}
