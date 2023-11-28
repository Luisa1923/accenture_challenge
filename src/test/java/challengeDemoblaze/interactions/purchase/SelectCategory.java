package challengeDemoblaze.interactions.purchase;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import challengeDemoblaze.userInterface.HomePage;

public class SelectCategory implements Interaction {

    private final String category;

    public SelectCategory(String category) {
        this.category = category;
    }

    @Step("{0} enters the graphics creation modal")
    @Override
    public <T extends Actor> void performAs(T actor) {

        if (category.equalsIgnoreCase("Monitors")) {
            Click.on(HomePage.MONITORS_CATEGORY).performAs(actor);
        } else if (category.equalsIgnoreCase("Phones")) {
            Click.on(HomePage.PHONE_CATEGORY).performAs(actor);
        } else if (category.equalsIgnoreCase("Laptops")) {
            Click.on(HomePage.LAPTOPS_CATEGORY).performAs(actor);
        } else {
            throw new IllegalArgumentException("Categoría no valida: " + category);
        }
    }
}