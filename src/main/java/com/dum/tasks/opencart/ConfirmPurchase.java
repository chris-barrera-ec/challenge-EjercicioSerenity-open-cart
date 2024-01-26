package com.dum.tasks;
import com.dum.userinterfaces.CheckoutPageInterface;
import com.dum.userinterfaces.CartPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
public class ConfirmPurchase implements Task{
    public static Task confirmThePurchase() { return instrumented(ConfirmPurchase.class);}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckoutPageInterface.INPUT_COMMENT, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("Datos ingresados en test").into(CheckoutPageInterface.INPUT_COMMENT),
                WaitUntil.the(CheckoutPageInterface.INPUT_AGREE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutPageInterface.INPUT_AGREE),
                WaitUntil.the(CheckoutPageInterface.BTN_METHOD, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutPageInterface.BTN_METHOD),

                WaitUntil.the(CheckoutPageInterface.BTN_CONFIRM, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutPageInterface.BTN_CONFIRM)

                /*,

                WaitUntil.the(CheckoutPageInterface.STOP2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutPageInterface.STOP2)*/

        );
    }
}
