package challengeDemoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import challengeDemoblaze.interactions.PurchaseFlow;

public class CompletePurchase implements Task {

    public static CompletePurchase fillPlaceOrder() { return new CompletePurchase();}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PurchaseFlow.openCart(),
                PurchaseFlow.fillThePlaceOrder()
        );
    }
}
