package com.dum.tasks.opencart;
import com.dum.userinterfaces.opencart.CheckoutPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
public class VerifyOrderIsCompleted implements Task{
    public static Task verifyCompleted() { return instrumented(VerifyOrderIsCompleted.class);}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckoutPageInterface.FINAL_MESSAGE, isVisible()).forNoMoreThan(20).seconds()
        );
        String mensajePagina = CheckoutPageInterface.FINAL_MESSAGE.resolveFor(actor).getText();
        String textoEsperado = "Your order has been placed!";
        if (!mensajePagina.equals(textoEsperado)){
            System.out.println("El texto en la pagina es INCORRECTO!: " + mensajePagina + " SE ESPERABA QUE FUERA: "+textoEsperado);
            //provocando un error
            actor.attemptsTo(
                    Click.on(CheckoutPageInterface.COMPROBACION_TEXTO_ESPERADO)
            );
        }
        else
            System.out.println("OK. El texto en la pagina es el esperado: " + mensajePagina);
    }
}
