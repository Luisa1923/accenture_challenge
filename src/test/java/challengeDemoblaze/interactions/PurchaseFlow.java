package challengeDemoblaze.interactions;

import net.serenitybdd.screenplay.Interaction;
import challengeDemoblaze.interactions.purchase.FillThePlaceOrder;
import challengeDemoblaze.interactions.purchase.OpenCart;
import challengeDemoblaze.interactions.purchase.SelectCategory;
import challengeDemoblaze.interactions.purchase.SelectProduct;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PurchaseFlow {

    private PurchaseFlow() {
    }

    public static Interaction openCart() { return instrumented(OpenCart.class);
    }

    public static Interaction selectCategory(String category) { return instrumented(SelectCategory.class,category);
    }

    public static Interaction selectProduct(String brand) { return instrumented(SelectProduct.class,brand);
    }

    public static Interaction fillThePlaceOrder() { return instrumented(FillThePlaceOrder.class);
    }

}
