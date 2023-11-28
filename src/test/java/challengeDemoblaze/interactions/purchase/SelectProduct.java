package challengeDemoblaze.interactions.purchase;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import challengeDemoblaze.userInterface.DetailProductPage;
import challengeDemoblaze.userInterface.HomePage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectProduct implements Interaction {

    private final String brand;

    public SelectProduct(String brand) {
        this.brand = brand;
    }

    @Step("{0} enters the graphics creation modal")
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(HomePage.PRODUCT_BY_BRAND.of(brand), isPresent()).forNoMoreThan(5).seconds();
        Click.on(HomePage.PRODUCT_BY_BRAND.of(brand)).performAs(actor);
        Click.on(DetailProductPage.ADD_TO_CART_BUTTON).performAs(actor);
    }
}