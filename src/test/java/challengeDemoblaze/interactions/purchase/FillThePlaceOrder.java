package challengeDemoblaze.interactions.purchase;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import challengeDemoblaze.userInterface.CartPage;

import java.time.Duration;
import java.util.Random;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillThePlaceOrder implements Interaction {

    private final String customerName;
    private final String country;
    private final String city;
    private final String creditCard;
    private final String month;
    private final String year;

    public FillThePlaceOrder() {
        String[] names = {"Soleil", "Ezio", "Zephyr", "Isolde", "Thalía", "Aurelius", "Seraphina", "Calix",
                "Cassiopeia", "Elysia", "Octavian", "Lumina", "Vespera", "Zephyrine", "Ambrosia", "Caelum", "Astrid",
                "Zenith", "Eowyn", "Sylvan", "Quintessa", "Icarus", "Eulalia", "Amaryllis", "Lirael", "Caius",
                "Seraphim", "Thessaly", "Bellerophon", "Xanthe", "Lucian", "Isabeau", "Veridian", "Lyra", "Aurelia",
                "Euphemia", "Alistair", "Melisandre", "Odysseus", "Ondine", "Serenity", "Vaelin", "Elowen", "Thanos",
                "Nereus", "Elara", "Iolanthe", "Eupraxia", "Zephyrus", "Cassian", "Arianwen", "Thalia", "Eponine",
                "Leocadia", "Eirlys", "Aloysius", "Isolde", "Endymion", "Tindra", "Ignatius", "Fiora", "Astraea",
                "Alaric", "Ondine", "Cressida", "Valerian", "Persephone", "Zephyrine", "Oberon", "Thalassa", "Ariadne",
                "Icarus", "Sorin", "Anastasia", "Oberon", "Aurelia", "Rhiannon", "Lysander", "Eos", "Zephyra", "Faelan",
                "Callista", "Eirian", "Aurora", "Orion", "Eudora", "Zephyrus", "Aristeia","Andy", "Juana", "Carlota",
                "David", "Emanuel", "Marian", "Tulia", "Jose", "Felipe", "Oscar"};

        String[] country = {"Peru", "Colombia", "China", "Panama", "Ecuador", "Argentina", "Suiza", "Rusia"};

        String[] city = {"Bogota", "Lima", "Pekin", "Moscu", "Medellin", "Estambul", "Cali"};

        String[] month = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre","Noviembre","Diciembre"};

        String[] year = {"2021", "2022", "2023", "2024"};

        Random random = new Random();
        int indiceAleatorio = random.nextInt(names.length);
        String randomName = names[indiceAleatorio];

        int indiceAleatorioC = random.nextInt(country.length);
        String randomCountry = country[indiceAleatorioC];

        int indiceAleatorioCi = random.nextInt(city.length);
        String randomCity = city[indiceAleatorioCi];

        int numeroAleatorio = random.nextInt(15000000);

        int indiceAleatorioM = random.nextInt(month.length);
        String randomMonth = month[indiceAleatorioM];

        int indiceAleatorioY = random.nextInt(year.length);
        String randomYear = year[indiceAleatorioY];

        this.customerName = randomName;
        this.country = randomCountry;
        this.city = randomCity;
        this.creditCard = String.valueOf(numeroAleatorio);
        this.month =randomMonth;
        this.year = randomYear;
    }

    @Step("{0} enters aleatory name of the customer #customerName in the field customer name")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.PLACE_ORDER_BUTTON),
                WaitUntil.the(CartPage.NAME_INPUT_FORM_PLACE_ORDER,isVisible()).forNoMoreThan(Duration.ofSeconds(5)),
                Enter.theValue(this.customerName).into(CartPage.NAME_INPUT_FORM_PLACE_ORDER),
                Enter.theValue(this.country).into(CartPage.COUNTRY_INPUT_FORM_PLACE_ORDER),
                Enter.theValue(this.city).into(CartPage.CITY_INPUT_FORM_PLACE_ORDER),
                Enter.theValue(this.creditCard).into(CartPage.CARD_INPUT_FORM_PLACE_ORDER),
                Enter.theValue(this.month).into(CartPage.MONTH_INPUT_FORM_PLACE_ORDER),
                Enter.theValue(this.year).into(CartPage.YEAR_INPUT_FORM_PLACE_ORDER),
                Click.on(CartPage.PURCHASE_BUTTON)
        );

    }
}