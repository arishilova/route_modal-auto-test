package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GitLoginPage {

    public SelenideElement gitLoginField() {
        return $(".js-login-field").as("поле ввода логина GitHub");
    }

    public SelenideElement gitPasswordField() {
        return $(".js-password-field").as("поле ввода пароля GitHub");
    }

    public SelenideElement gitSignInButton() {
        return $(".js-sign-in-button").as("кнопка авторизации GitHub");
    }

}
