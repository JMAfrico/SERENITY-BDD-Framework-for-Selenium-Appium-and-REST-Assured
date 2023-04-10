package funcoes;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

public class SiteGoogle extends PageObject {

    public void abrir() {
        Open.url("http://www.google.com");
        WebElementFacade textBox = find(By.name("q"));
//        textBox.shouldBeVisible();
        textBox.typeAndEnter("Rato");
    }
}
