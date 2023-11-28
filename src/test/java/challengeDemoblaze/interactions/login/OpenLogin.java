package challengeDemoblaze.interactions.login;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import challengeDemoblaze.userInterface.HomePage;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenLogin implements Interaction {

    @Step("{0} enters the graphics creation modal")
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(HomePage.LOGIN_BUTTON,isVisible()).forNoMoreThan(Duration.ofSeconds(5)).performAs(actor);
        Click.on(HomePage.LOGIN_BUTTON).performAs(actor);
    }
}
