package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DownloadManualPoliticsPage extends PageObject {
    public static final Target ABOUT_US_LINK = Target.the("button that shows us general information").
            located(By.xpath("//a[@id='header-nosotros']"));
    public static final Target CORPORATE_INFORMATION_LINK = Target.the("button that shows us the Menu").
            located(By.xpath("//a[@id='serv']"));
    public static final Target SUPPLIER_LINK = Target.the("button that shows us the supplier options").
            located(By.xpath("//a[text()='Proveedores']"));
    public static final Target DOWNLOAD_POLITICS_BUTTON = Target.the("button that download the politics manual").
            located(By.xpath("//h2[contains(text(),'Políticas de tratamiento')]//following::a[1]"));
}
