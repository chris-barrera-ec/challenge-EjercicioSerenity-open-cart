package com.dum.tasks;
import com.dum.userinterfaces.ShopPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProducts implements Task{
    public static Task addProductsToCart() { return instrumented(AddProducts.class);}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ShopPageInterface.BTN_ADD_TO_CART_1, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_ADD_TO_CART_1),

                WaitUntil.the(ShopPageInterface.BTN_ADD_TO_CART_2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_ADD_TO_CART_2)

        );
    }
}
