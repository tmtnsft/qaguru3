package guru.qa3;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CodeSampleCheck {

    @Test
    void softAssertionsContainsCodeSample () {
        //Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейдите в раздел Wiki проекта
        $("wiki-tab").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
    }
}
