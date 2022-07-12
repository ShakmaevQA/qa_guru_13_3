package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
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


        //Имя и Фамилия
        $("#firstName").setValue("Timur");
        $("#lastName").setValue("Shakmaev");


        //Емайл
        $("#userEmail").setValue("shaq@mail.ru");


        //Выбор пола
        $(byText("Male")).click();


        //Введение номера телефона
        $("#userNumber").setValue("9276043709");


        //Выбор даты рождения( выпадающий список )
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOption("1998");
        $(byText("9")).click();


        //Выбор предмета
        $(".subjects-auto-complete__input").click();
        $("#subjectsInput").sendKeys("C");
        $(byText("Computer Science")).click();


        //Хобби
        $(byText("Sports")).click();


        //Загрузка фото
        $("#uploadPicture").uploadFromClasspath("1.png");


        //Адрес проживания
        $("#currentAddress").setValue("Chernogoria");
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Delhi")).click();


        //Отобразить
        $("#submit").click();


        //Проверка
        $(".modal-content").shouldHave(
                text("Timur"),
                text("Shakmaev"),
                text("shaq@mail.ru"),
                text("9276043709"),
                text("Male"),
                text("09 Apl 1998"),
                text("Computer science"),
                text("Sport"),
                text("1.png"),
                text("Chernogoria"),
                text("NCR"),
                text("Delhi")

        );
    }}
