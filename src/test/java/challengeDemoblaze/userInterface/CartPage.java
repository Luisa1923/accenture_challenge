package challengeDemoblaze.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class CartPage {

    public static final Target PLACE_ORDER_BUTTON = Target
            .the("Boton para desplegar formulario de orden de compra ")
            .located(cssSelector("div div [data-target*='orderModal']"));

    public static final Target NAME_INPUT_FORM_PLACE_ORDER = Target
            .the("campo para ingresar nombre de usuario en formulario de compra")
            .located(cssSelector("form div [id='name']"));

    public static final Target COUNTRY_INPUT_FORM_PLACE_ORDER = Target
            .the("campo para ingresar pais en formulario de compra")
            .located(cssSelector("form div [id='country']"));

    public static final Target CITY_INPUT_FORM_PLACE_ORDER = Target
            .the("campo para ingresar ciudad en formulario de compra")
            .located(cssSelector("form div [id='city']"));

    public static final Target CARD_INPUT_FORM_PLACE_ORDER = Target
            .the("campo para ingresar tarjeta de credito en formulario de compra")
            .located(cssSelector("form div [id='card']"));

    public static final Target MONTH_INPUT_FORM_PLACE_ORDER = Target
            .the("campo para ingresar mes en formulario de compra")
            .located(cssSelector("form div [id='month']"));

    public static final Target YEAR_INPUT_FORM_PLACE_ORDER = Target
            .the("campo para ingresar año de usuario en formulario de compra")
            .located(cssSelector("form div [id='year']"));

    public static final Target PURCHASE_BUTTON = Target
            .the("Boton para confirmar y finalizar compra")
            .located(cssSelector("div div [onclick*='purchaseOrder']"));

    public static final Target CONFIRM_PURCHASE = Target
            .the("Texto de confirmación de compra")
            .located(xpath("//h2[contains(text(), 'Thank you for your purchase')]"));
}
