package reto.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.questions.ValidarDocumento;
import reto.tasks.AbrirPaginaBanistmo;
import reto.tasks.IrAprenderEsFacilLegalesYFatca;
import reto.tasks.GenerarReporte;


public class MyStepdefs {

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("ingreso a la pagina web de banistmo")
    public void ingresoALaPaginaWebDeBanistmo() {
        OnStage.theActorCalled("actor").wasAbleTo(
                AbrirPaginaBanistmo.urlBanistmo()
        );
    }

    @Cuando("accedo a la sección aprender es facil, legales, fatca & crs")
    public void accedoALaSecciónAprenderEsFacilLegalesFatcaCrs() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IrAprenderEsFacilLegalesYFatca.irAprenderEsFacilLegalesYFatca()
        );
    }

    @Y("generar el documento pdf")
    public void generarElDocumentoPdf() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GenerarReporte.seleccionarReporte()
        );
    }

    @Entonces("Verifico que el documento generado sea el correcto")
    public void verificoQueElDocumentoGeneradoSeaElCorrecto() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarDocumento.toThe()));
    }

}
