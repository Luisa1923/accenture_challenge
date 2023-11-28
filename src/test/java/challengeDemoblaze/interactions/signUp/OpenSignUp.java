package challengeDemoblaze.interactions.signUp;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import challengeDemoblaze.userInterface.HomePage;

public class OpenSignUp implements Interaction {

    @Step("{0} enters the graphics creation modal")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(HomePage.SIGN_UP_BUTTON).performAs(actor);}
}
