package challengeDemoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import challengeDemoblaze.interactions.SignUpFlow;

public class CreateUser implements Task {

    public static CreateUser randomData() { return new CreateUser();}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SignUpFlow.openSignUp(),
                SignUpFlow.enterCredentialsSignUp()
        );
    }
}
