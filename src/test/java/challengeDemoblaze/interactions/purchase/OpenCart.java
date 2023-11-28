package challengeDemoblaze.interactions.purchase;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import challengeDemoblaze.userInterface.HomePage;

public class OpenCart implements Interaction {

    @Step("{0} enters the graphics creation modal")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(HomePage.CART_BUTTON).performAs(actor);}
}