package challengeDemoblaze.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class HomePage {

    public static final Target SIGN_UP_BUTTON = Target
            .the("Boton para seleccionar proceso de registro")
            .located(cssSelector("ul li [data-target='#signInModal']"));

    public static final Target LOGIN_BUTTON = Target
            .the("Boton para seleccionar inicio de sesión")
            .located(cssSelector("ul li [data-target='#logInModal']"));

    public static final Target WELCOME_USER = Target
            .the("Texto de bienvenida por inicio de sesión")
            .located(xpath("//a[contains(text(), 'Welcome')]"));

    public static final Target PHONE_CATEGORY = Target
            .the("Sección de categoria Phones")
            .located(cssSelector("div div [onclick*='phone']"));

    public static final Target LAPTOPS_CATEGORY = Target
            .the("Sección de categoria Laptops")
            .located(cssSelector("div div [onclick*='notebook']"));

    public static final Target MONITORS_CATEGORY = Target
            .the("Sección de categoria Monitors")
            .located(cssSelector("div div [onclick*='monitor']"));

    public static Target PRODUCT_BY_BRAND = Target
            .the("Producto según marca")
            .locatedBy("//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), translate('{0}', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'))]");

    public static final Target CART_BUTTON = Target
            .the("Boton para seleccionar carrito de compras")
            .located(cssSelector("ul li [id='cartur']"));
}
