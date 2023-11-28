package challengeDemoblaze.interactions.login;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import challengeDemoblaze.interactions.signUp.SaveDataUser;
import challengeDemoblaze.userInterface.LoginForm;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterCredentialsLogin implements Interaction {

    public EnterCredentialsLogin() {
    }

    public static EnterCredentialsLogin withSavedCredentials() {
        return new EnterCredentialsLogin();
    }

    @Step("{0} enters aleatory name of the customer #customerName in the field customer name")
    @Override
    public <T extends Actor> void performAs(T actor) {

        String customerName = SaveDataUser.getCustomerName();
        String passwordName = SaveDataUser.getPasswordName();
        actor.attemptsTo(
                WaitUntil.the(LoginForm.USERNAME_LOGIN_INPUT,isVisible()).forNoMoreThan(Duration.ofSeconds(5)),
                Enter.theValue(customerName + Keys.ENTER).into(LoginForm.USERNAME_LOGIN_INPUT),
                Enter.theValue(passwordName + Keys.ENTER).into(LoginForm.PASSWORD_LOGIN_INPUT),
                Click.on(LoginForm.LOGIN_CONFIRM)
        );

    }
}