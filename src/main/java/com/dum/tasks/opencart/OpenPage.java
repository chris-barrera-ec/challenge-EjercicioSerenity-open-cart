package com.dum.tasks.opencart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

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
