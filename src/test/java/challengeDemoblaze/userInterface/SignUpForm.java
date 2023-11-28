package challengeDemoblaze.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.cssSelector;

public class SignUpForm {

    public static final Target USERNAME_SIGNUP_INPUT = Target
            .the("campo para ingresar nombre de usuario en registro")
            .located(cssSelector("form div [id='sign-username']"));

    public static final Target PASSWORD_SIGNUP_INPUT = Target
            .the("campo para ingresar contraseña de usuario en registro")
            .located(cssSelector("form div [id='sign-password']"));

    public static final Target SIGNUP_CONFIRM = Target
            .the("Boton para confirmar registro de usuario")
            .located(cssSelector("div div [onclick='register()']"));
}
