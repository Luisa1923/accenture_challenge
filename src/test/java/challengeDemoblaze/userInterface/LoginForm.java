package challengeDemoblaze.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.cssSelector;

public class LoginForm {

    public static final Target USERNAME_LOGIN_INPUT = Target
            .the("campo para ingresar nombre de usuario en inicio de sesión")
            .located(cssSelector("form div [id='loginusername']"));

    public static final Target PASSWORD_LOGIN_INPUT = Target
            .the("campo para ingresar contraseña de usuario en inicio de sesión")
            .located(cssSelector("form div [id='loginpassword']"));

    public static final Target LOGIN_CONFIRM = Target
            .the("Boton para iniciar sesión de usuario")
            .located(cssSelector("div div [onclick='logIn()']"));

}
