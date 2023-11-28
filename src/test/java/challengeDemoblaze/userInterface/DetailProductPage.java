package challengeDemoblaze.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.cssSelector;

public class DetailProductPage {
    public static final Target SEARCH_FIELD = Target.the("interactions field").locatedBy("#searchbox_input");

    public static final Target ADD_TO_CART_BUTTON = Target
            .the("Botón para agregar producto al carrito de compra")
            .located(cssSelector("div div [onclick*='addToCart']"));
}
