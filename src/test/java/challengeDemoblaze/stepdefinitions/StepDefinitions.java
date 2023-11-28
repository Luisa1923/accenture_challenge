package challengeDemoblaze.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import org.hamcrest.Matchers;
import challengeDemoblaze.questions.GetTextSystemAlert;
import challengeDemoblaze.questions.ValidateLogin;
import challengeDemoblaze.questions.ValidatePurchase;
import challengeDemoblaze.tasks.*;
import static java.lang.Boolean.TRUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitions {

    @Dado("que el {actor} ha navegado a la pagina demoblaze")
    public void que_el_usuario_ha_navegado_a_la_pagina_demoblaze(Actor actor) {
        actor.attemptsTo(
        NavigateTo.webPage("https://www.demoblaze.com/#")
        );
    }

    @Cuando("realiza proceso de registro de usuario")
    public void realiza_proceso_de_registro_de_usuario() {
        CreateUser.randomData().performAs(theActorInTheSpotlight());
    }

    @Entonces("el registro es exitoso")
    public void el_registro_es_exitoso() {
        theActorInTheSpotlight().should(
                seeThat("El registro fue exitoso",GetTextSystemAlert.text(), Matchers.equalTo("Sign up successful."))
        );

    }
    @Entonces("ingresa a su cuenta correctamente")
    public void ingresa_a_su_cuenta_correctamente() {
        LoginUser.withSavedData().performAs(theActorInTheSpotlight());
        theActorInTheSpotlight().should(
                seeThat("Inicio de sesión exitoso", ValidateLogin.textIsVisible(), Matchers.equalTo(TRUE))
        );
    }

    @Cuando("agrega al carrito de compras un producto de la categoria {string} y la marca {string}")
    public void agrega_al_carrito_de_compras_un_producto_de_la_categoria_categoria_y_la_marca_marca(String category,
                                                                                                    String brand) {
        AddProductsToCart.byParameters(category,brand).performAs(theActorInTheSpotlight());
        theActorInTheSpotlight().should(
                seeThat("Se agrego correctamente el producto",GetTextSystemAlert.text(), Matchers.equalTo("Product added"))
        );
    }

    @Cuando("termina proceso de compra")
    public void termina_proceso_de_compra() {
        CompletePurchase.fillPlaceOrder().performAs(theActorInTheSpotlight());
    }

    @Entonces("se confirma proceso de compra exitoso")
    public void se_confirma_proceso_de_compra_exitoso() {
        theActorInTheSpotlight().should(
                seeThat("Compra exitosa", ValidatePurchase.textIsVisible(), Matchers.equalTo(TRUE))
        );
    }
}