package com.dum.tasks;
import com.dum.userinterfaces.ShopPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.actions.Open;
public class OpenPage implements Task {
    private final String url;

    public OpenPage(String url) {this.url = url;}

    public static Task loadpage(){
        String url = "http://opencart.abstracta.us/";
        return instrumented(OpenPage.class, url);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

}
