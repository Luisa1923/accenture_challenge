package challengeDemoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import challengeDemoblaze.interactions.PurchaseFlow;

public class AddProductsToCart implements Task {

    private String category;
    private final String brand;

    public AddProductsToCart(String category, String brand) {
        this.category = category;
        this.brand = brand;
    }

    public static AddProductsToCart byParameters(String category, String brand) { return new AddProductsToCart(category,brand);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PurchaseFlow.selectCategory(category),
                PurchaseFlow.selectProduct(brand)
        );
    }
}
