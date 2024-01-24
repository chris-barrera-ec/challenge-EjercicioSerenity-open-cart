package com.dum.userinterfaces;
import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class ShopPageInterface extends PageObject {
    public static final Target BTN_ADD_TO_CART_1 = Target.the("Button add to cart Product 1").located(By.xpath("//button[@onclick=\"cart.add('43');\"]"));
    public static final Target BTN_ADD_TO_CART_2 = Target.the("Button add to cart Product 2").located(By.xpath("/html//div[@id='content']/div[@class='row']/div[2]/div[@class='product-thumb transition']/div[@class='button-group']/button[1]"));
    public static final Target BTN_VIEW_CART = Target.the("Button view cart").located(By.xpath("//div[@id='top-links']//a[@title='Shopping Cart']/i[@class='fa fa-shopping-cart']"));

}
