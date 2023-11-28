package challengeDemoblaze.interactions.signUp;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import challengeDemoblaze.userInterface.SignUpForm;
import java.time.Duration;
import java.util.Random;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterCredentialsSignUp implements Interaction {

    private final String customerName;
    private final String passwordName;

    public EnterCredentialsSignUp() {
        String[] nombres = {"Soleil", "Ezio", "Zephyr", "Isolde", "Thalía", "Aurelius", "Seraphina", "Calix",
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

        Random random = new Random();
        int indiceAleatorio = random.nextInt(nombres.length);
        String nombreAleatorio = nombres[indiceAleatorio];

        int numeroAleatorio = random.nextInt(10000);

        this.customerName = nombreAleatorio + numeroAleatorio;
        this.passwordName = nombreAleatorio + numeroAleatorio;

        SaveDataUser.setDatosUsuarioGenerados(customerName, passwordName);
    }

    @Step("{0} enters aleatory name of the customer #customerName in the field customer name")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SignUpForm.USERNAME_SIGNUP_INPUT,isVisible()).forNoMoreThan(Duration.ofSeconds(5)),
                Enter.theValue(this.customerName + Keys.ENTER).into(SignUpForm.USERNAME_SIGNUP_INPUT),
                Enter.theValue(this.passwordName + Keys.ENTER).into(SignUpForm.PASSWORD_SIGNUP_INPUT),
                Click.on(SignUpForm.SIGNUP_CONFIRM)
        );

    }
}

