package guru.qa3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CodeSampleCheck {

    @BeforeAll
    static void BrowserSize() {
        Configuration.browserSize = "1920x3072";
    }

    @Test
    void softAssertionsContainsCodeSample () {
        //Откройте страницу Selenide в Github
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        //Перейдите в раздел Wiki проекта
        $("[data-tab-item=i5wiki-tab]").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-body").shouldHave(text("Soft assertions"));
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

        sleep(5000);
    }
}
