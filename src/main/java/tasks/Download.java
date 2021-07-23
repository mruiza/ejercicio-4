package tasks;

import interactions.GoToTheWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static userinterface.DownloadManualPoliticsPage.*;

public class Download implements Task {

    public static Download theManual() {
        return Tasks.instrumented(Download.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ABOUT_US_LINK),
                Click.on(CORPORATE_INFORMATION_LINK),
                Click.on(SUPPLIER_LINK),
                Scroll.to(DOWNLOAD_POLITICS_BUTTON),
                Click.on(DOWNLOAD_POLITICS_BUTTON),
                GoToTheWindow.number()
        );
    }
}
