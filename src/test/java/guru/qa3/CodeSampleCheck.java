package guru.qa3;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CodeSampleCheck {

    @Test
    void softAssertionsContainsCodeSample () {
        //Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейдите в раздел Wiki проекта
        $("[data-tab-item=i5wiki-tab]").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-body").shouldHave(text("Soft assertions"));
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

        sleep(5000);
    }
}
