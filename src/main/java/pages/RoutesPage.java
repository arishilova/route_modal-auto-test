package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RoutesPage {

    public SelenideElement addRouteButton() {
        return $(byText("Добавить маршрут")).as("кнопка добавления маршрута");
    }

    public SelenideElement searchRouteInput() {
        return $("label.input-wrapper").as("инпут поиска в модальном окне добавления маршрута");
    }

}
