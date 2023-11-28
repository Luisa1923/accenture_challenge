package challengeDemoblaze.interactions;

import net.serenitybdd.screenplay.Interaction;
import challengeDemoblaze.interactions.login.EnterCredentialsLogin;
import challengeDemoblaze.interactions.login.OpenLogin;
import challengeDemoblaze.interactions.signUp.EnterCredentialsSignUp;
import challengeDemoblaze.interactions.signUp.OpenSignUp;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignUpFlow {

    private SignUpFlow() {
    }

    public static Interaction openSignUp() { return instrumented(OpenSignUp.class);
    }

    public static Interaction enterCredentialsSignUp() { return instrumented(EnterCredentialsSignUp.class);
    }

    public static Interaction openLogin() { return instrumented(OpenLogin.class);
    }

    public static Interaction enterCredentialsLogin() { return instrumented(EnterCredentialsLogin.class);
    }

}
