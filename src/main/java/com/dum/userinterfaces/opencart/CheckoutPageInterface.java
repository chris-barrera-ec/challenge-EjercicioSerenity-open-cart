package com.dum.userinterfaces.opencart;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class CheckoutPageInterface {
    public static final Target LINK_GUESTCHECKOUT = Target.the("Link Guest checkout").located((By) By.xpath("//div[@id='collapse-checkout-option']/div[@class='panel-body']/div/div[1]/div[2]/label/input[@name='account']"));
    public static final Target BTN_CONTINUE = Target.the("Button Continue").located((By) By.id("button-account"));
    public static final Target INPUT_FIRSTNAME = Target.the("Input Firstname").located((By) By.id("input-payment-firstname"));
    public static final Target INPUT_LASTNAME = Target.the("Input Lastname").located((By) By.id("input-payment-lastname"));
    public static final Target INPUT_EMAIL = Target.the("Input email").located((By) By.id("input-payment-email"));
    public static final Target INPUT_TELEPHONE = Target.the("Input telephone").located((By) By.id("input-payment-telephone"));
    public static final Target INPUT_COMPANY = Target.the("Input company").located((By) By.id("input-payment-company"));
    public static final Target INPUT_ADDRESS = Target.the("Input address").located((By) By.xpath("//fieldset[@id='address']//input[@name='address_1']"));
    public static final Target INPUT_ADDRESS2 = Target.the("Input address2").located((By) By.xpath("//fieldset[@id='address']//input[@name='address_2']"));
    public static final Target INPUT_CITY = Target.the("Input city").located((By) By.id("input-payment-city"));
    public static final Target INPUT_POSTCODE = Target.the("Input postcode").located((By) By.id("input-payment-postcode"));
    public static final Target INPUT_COUNTRY_ECUADOR = Target.the("Input country ecuador").located((By) By.xpath("//*[@id=\"input-payment-country\"]/option[69]"));
    public static final Target INPUT_ZONE = Target.the("Input zone").located((By) By.xpath("//*[@id=\"input-payment-zone\"]/option[2]"));
    public static final Target BTN_GUEST = Target.the("Button Continue").located((By) By.id("button-guest"));
    public static final Target INPUT_COMMENT = Target.the("Input comment").located((By) By.xpath("//textarea[@name='comment']"));
    public static final Target BTN_SHIP = Target.the("Button shipping").located((By) By.id("button-shipping-method"));
    public static final Target INPUT_AGREE = Target.the("Input check agree").located((By) By.xpath("//div[@id='collapse-payment-method']//input[@name='agree']"));
    public static final Target BTN_METHOD = Target.the("Button Method").located((By) By.id("button-payment-method"));
    public static final Target BTN_CONFIRM = Target.the("Button Confirm").located((By) By.id("button-confirm"));
    public static final Target FINAL_MESSAGE = Target.the("Mensaje final").located((By) By.xpath("//*[@id=\"content\"]/h1"));
    public static final Target COMPROBACION_TEXTO_ESPERADO = Target.the("comprobacion texto esperado").located((By) By.id("TEXTONOENCONTRADO"));
}
