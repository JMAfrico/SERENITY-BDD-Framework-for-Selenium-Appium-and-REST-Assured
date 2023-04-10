package funcoes;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {

        @Managed
        WebDriver driver;

        @FindBy(xpath = "//input[@name='q']")
        WebElement googleSearch;

        @Title("Acessando Google Pelo Serenity")
        @Test
        public void FazerLoginSerenity(){
            open();
            System.out.println(getTitle());

            WebElementFacade textBox = find(By.name("q"));
            textBox.shouldBeVisible();
            textBox.typeAndEnter("Rato");

        }

    }
