package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;



public class student_registration_form {

    @BeforeAll
    static void preconditions() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void practiceFormTests() {
        open("/automation-practice-form");

        // Удаление рекламы на странице
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        // Тестирование Student Registration Form
        $("#firstName").setValue("Timur");
        $("#lastName").setValue("Shakmaev");

        $("#userEmail").setValue("shaq@mail.ru");

        $(new ByText("Male")).click();

        //Введение номера телефона

        $("#userNumber").setValue("9276043709");

        //Выбор даты рождения( выпадающий список )

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOption("1998");
        $(new ByText("9")).click();









    }}
