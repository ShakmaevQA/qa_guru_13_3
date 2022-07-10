package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TexBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
    }


    @Test
    void successfulTest() {
        open( "/text-box");

        $("[id=userName]").setValue("Shakmaev Timur");
        $("[id=userEmail]").setValue("shaq@mail.ru");
        $("[id=currentAddress]").setValue("Samara");
        $("[id=permanentAddress]").setValue("Chernogoria");
        $("[id=submit]").click();

        $("[id=output]").shouldHave(text("Shakmaev Timur"), text("shaq@mail.ru"),
                text("Samara"), text("Chernogoria"));



    }
}
