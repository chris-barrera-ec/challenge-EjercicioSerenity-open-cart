package com.dum.tasks.opencart;
import com.dum.userinterfaces.opencart.CartPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ViewProductsInCart implements Task{
    public static Task viewCart() { return instrumented(ViewProductsInCart.class);}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CartPageInterface.BTN_CHECKOUT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CartPageInterface.BTN_CHECKOUT)
        );
    }

}
