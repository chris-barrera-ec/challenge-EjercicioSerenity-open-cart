package com.dum.userinterfaces.opencart;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class ShopPageInterface extends PageObject {
    public static final Target BTN_ADD_TO_CART_1 = Target.the("Button add to cart Product 1").located(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img"));
    public static final Target BTN_ADD_TO_CART_2 = Target.the("Button add to cart Product 2").located(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img"));
    public static final Target BTN_CART = Target.the("Button cart").located(By.id("button-cart"));
    public static final Target BTN_VIEW_CART = Target.the("Button view cart").located(By.xpath("//div[@id='top-links']//a[@title='Shopping Cart']/i[@class='fa fa-shopping-cart']"));
    public static final Target BTN_HOME = Target.the("Button home").located(By.xpath("//div[@id='product-product']/ul[@class='breadcrumb']//i[@class='fa fa-home']"));
}
