package com.dum.glue.opencart;
import com.dum.tasks.opencart.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginGlue {
    private static final String ACTOR_NAME = "User";

    @Before
    public void setTheStag(){OnStage.setTheStage(new OnlineCast());}

    @Given("^(.*) esta en la pagina de open cart$")
    public void login(String actor){theActorCalled(actor).attemptsTo(OpenPage.loadpage());}

    @When("agrega dos productos al carrito de compras")
    public void agregaDosProductosAlCarritoDeCompras() {
        when(OnStage.theActorInTheSpotlight()).attemptsTo(AddProducts.addProductsToCart());
    }

    @And("ingresa al carrito de compras y procede al checkout")
    public void ingresaAlCarritoDeCompras() {
        when(OnStage.theActorInTheSpotlight()).attemptsTo(ViewProductsInCart.viewCart());
    }

    @When("ingresa datos para confirmar compra {string}, {string},  {string},  {string},  {string},  {string},  {string}, {string},  {string},  {string}")
    public void ingresaDatosParaConfirmarCompra(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9) {
        when(OnStage.theActorInTheSpotlight()).attemptsTo(EnterInfoGuestCheckout.checkoutTheProducts(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9));
    }

    @And("confirma la orden de compra")
    public void confirmaLaOrdenDeCompra() {
        when(OnStage.theActorInTheSpotlight()).attemptsTo(ConfirmPurchase.confirmThePurchase());
    }

    @Then("verifica que se haya completado la orden de compra")
    public void verificaCompletadoLaOrdenDeCompra() {
        when(OnStage.theActorInTheSpotlight()).attemptsTo(VerifyOrderIsCompleted.verifyCompleted());
    }



}
