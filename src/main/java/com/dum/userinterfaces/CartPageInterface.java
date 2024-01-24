package com.dum.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class CartPageInterface {
    public static final Target BTN_CHECKOUT = Target.the("Button checkout").located(By.xpath("//a[@href='https://opencart.abstracta.us:443/index.php?route=checkout/checkout']"));

}
