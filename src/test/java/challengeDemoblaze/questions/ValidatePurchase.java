package challengeDemoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import challengeDemoblaze.userInterface.CartPage;

public class ValidatePurchase implements Question<Boolean> {
        public static ValidatePurchase textIsVisible() {
            return new ValidatePurchase();
        }

        @Override
        public Boolean answeredBy(Actor actor) {
            return Visibility.of(CartPage.CONFIRM_PURCHASE).answeredBy(actor);
        }
}
