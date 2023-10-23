import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {

    @Test
    void successfulSearchTest() {
        Configuration.timeout = 50000;
        open("https://www.google.com/");
        $("[name=q]").setValue("Selenide").pressEnter();
        $("[id=search]").shouldHave(Condition.text("selenide.org"));
    }
}
