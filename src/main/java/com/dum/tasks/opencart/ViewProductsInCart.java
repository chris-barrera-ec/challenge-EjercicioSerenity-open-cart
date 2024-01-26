package com.dum.tasks;
import com.dum.userinterfaces.ShopPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
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
                WaitUntil.the(ShopPageInterface.BTN_VIEW_CART, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_VIEW_CART)

        );
    }

}
