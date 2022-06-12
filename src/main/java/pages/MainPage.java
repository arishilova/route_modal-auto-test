package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public SelenideElement routesPageLink() {
        return $("a[href='/assembly/routes']").as("ссылка на страницу 'Маршруты'");
    }

}
