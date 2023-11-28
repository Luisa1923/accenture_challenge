package challengeDemoblaze.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class GetTextSystemAlert implements Question<String> {

    public static GetTextSystemAlert text() { return new GetTextSystemAlert();
        }

        @Override
        public String answeredBy(Actor actor) {
            try {
                WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
                WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(3));
                wait.until(ExpectedConditions.alertIsPresent());
                Alert alert = driver.switchTo().alert();
                String messageAlert= alert.getText();
                alert.accept();
                driver.switchTo().defaultContent();
                return messageAlert;

            } catch (Exception e) {
                throw new RuntimeException("No se puede obtener el texto de la alerta.", e);
            }
        }
    }