package challengeDemoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import challengeDemoblaze.interactions.SignUpFlow;

public class LoginUser implements Task {

    public static LoginUser withSavedData() { return new LoginUser();}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SignUpFlow.openLogin(),
                SignUpFlow.enterCredentialsLogin()
        );
    }
}
