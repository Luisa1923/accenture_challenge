package challengeDemoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import challengeDemoblaze.userInterface.HomePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidateLogin  implements Question<Boolean> {
        public static ValidateLogin textIsVisible() {
            return new ValidateLogin();
        }

        @Override
        public Boolean answeredBy(Actor actor) {
            WaitUntil.the(HomePage.WELCOME_USER, isPresent()).forNoMoreThan(5).seconds();
            return Visibility.of(HomePage.WELCOME_USER).answeredBy(actor);
        }
}
