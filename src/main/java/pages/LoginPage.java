package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement phoneField() {
        return $("input[data-test-id='input__phone']").as("поле ввода телефона");
        }

    public SelenideElement passwordField() {
        return $("input[data-test-id='input__password']").as("поле ввода пароля");
    }

    public SelenideElement signInButton() {
        return $("button[data-test-id='button__signin']").as("кнопка авторизации");
    }

}
