package com.dum.tasks.opencart;
import com.dum.userinterfaces.opencart.CheckoutPageInterface;
import com.dum.util.Persona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
public class EnterInfoGuestCheckout implements Task{
    private final String Nombre;
    private final String Apellido;
    private final String Correo;
    private final String Telefono;
    private final String Empresa;
    private final String Direccion;
    private final String Ciudad;
    private final String CodigoPostal;
    private final String Pais;
    private final String Provincia;
    public EnterInfoGuestCheckout(String nombre, String apellido, String correo, String telefono, String empresa,String direccion1,String ciudad,String codigoPostal,String pais, String provincia){
        Persona persona;
        persona = new Persona();

        this.Nombre=persona.getFirstName();
        this.Apellido=persona.getLastName();
        this.Correo=persona.getEmail();
        this.Telefono=persona.getPhone();
        this.Empresa=persona.getCompany();
        this.Direccion=persona.getAddress();
        this.Ciudad=persona.getCity();
        this.CodigoPostal=persona.getPostCode();
        this.Pais=persona.getCountry();
        this.Provincia=persona.getRegion();
    }
    public static Task checkoutTheProducts(String nombre, String apellido, String correo, String telefono, String empresa,String direccion1,String ciudad,String codigoPostal,String pais, String provincia) {
        return instrumented(EnterInfoGuestCheckout.class,nombre,apellido,correo,telefono,empresa,direccion1,ciudad,codigoPostal,pais,provincia);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckoutPageInterface.LINK_GUESTCHECKOUT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutPageInterface.LINK_GUESTCHECKOUT),
                WaitUntil.the(CheckoutPageInterface.BTN_CONTINUE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutPageInterface.BTN_CONTINUE),
                WaitUntil.the(CheckoutPageInterface.INPUT_FIRSTNAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(this.Nombre).into(CheckoutPageInterface.INPUT_FIRSTNAME),
                WaitUntil.the(CheckoutPageInterface.INPUT_LASTNAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(this.Apellido).into(CheckoutPageInterface.INPUT_LASTNAME),
                WaitUntil.the(CheckoutPageInterface.INPUT_EMAIL, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(this.Correo).into(CheckoutPageInterface.INPUT_EMAIL),
                WaitUntil.the(CheckoutPageInterface.INPUT_TELEPHONE, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(this.Telefono).into(CheckoutPageInterface.INPUT_TELEPHONE),
                WaitUntil.the(CheckoutPageInterface.INPUT_COMPANY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(this.Empresa).into(CheckoutPageInterface.INPUT_COMPANY),
                WaitUntil.the(CheckoutPageInterface.INPUT_ADDRESS, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(this.Direccion).into(CheckoutPageInterface.INPUT_ADDRESS),
                WaitUntil.the(CheckoutPageInterface.INPUT_ADDRESS2, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(this.Direccion).into(CheckoutPageInterface.INPUT_ADDRESS2),
                WaitUntil.the(CheckoutPageInterface.INPUT_CITY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(this.Ciudad).into(CheckoutPageInterface.INPUT_CITY),
                WaitUntil.the(CheckoutPageInterface.INPUT_POSTCODE, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(this.CodigoPostal).into(CheckoutPageInterface.INPUT_POSTCODE),
                WaitUntil.the(CheckoutPageInterface.INPUT_COUNTRY_ECUADOR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutPageInterface.INPUT_COUNTRY_ECUADOR),
                WaitUntil.the(CheckoutPageInterface.INPUT_ZONE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutPageInterface.INPUT_ZONE),
                WaitUntil.the(CheckoutPageInterface.BTN_GUEST, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CheckoutPageInterface.BTN_GUEST)
        );
    }
}
