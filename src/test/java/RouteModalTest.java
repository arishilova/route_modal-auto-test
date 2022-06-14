import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("a_sh")
@Feature("Модальное окно создания и редактирования маршрута")
public class RouteModalTest {

    @BeforeAll
    public static void init() {
        open("https://suslik.dev.cluster.kznexpess.com/signin");
        TestPages.gitLoginPage.gitLoginField()
                .sendKeys("a.shilova.kazanexpress@gmail.com");
        TestPages.gitLoginPage.gitPasswordField()
                .sendKeys("qwerty123");
        TestPages.gitLoginPage.gitSignInButton()
                .click();
    }

    @BeforeEach
    public void before() {
        open("https://suslik.dev.cluster.kznexpess.com/signin");
        TestPages.loginPage.phoneField()
                .sendKeys("0000000002");
        TestPages.loginPage.passwordField()
                .sendKeys("qwerty123");
        TestPages.loginPage.signInButton()
                .click();
        TestPages.mainPage.routesPageLink()
                .click();
        TestPages.routesPage.addRouteButton()
                .click();
    }

    @Test
    @Story("Поиск по городам")
    @DisplayName("Проверка успешного поиска по городам")
    public void shouldSearchCityTest() {

        step("Ввести в инпут название города", () -> {

        });

        step("Проверить, что название искомого города отобразилось в блоке городов", () -> {

        });

    }

    @Test
    @Story("Поиск по ПВЗ")
    @DisplayName("Проверка успешного поиска по ПВЗ")
    public void shouldSearchDPTest() {

        step("Ввести в инпут название ПВЗ", () -> {

        });

        step("Кликнуть по названию города в блоке городов", () -> {

        });

        step("Проверить, что название искомого ПВЗ отобразилось в блоке ПВЗ", () -> {

        });

    }

    @Test
    @Story("Список ПВЗ по выбранному городу")
    @DisplayName("Проверка отображения списка ПВЗ по выбранному городу")
    public void shouldSeeDPList() {

        step("Нажать на название города в блоке городов", () -> {

        });

        step("Проверить, что отобразился список ПВЗ по выбранному городу", () -> {

        });

    }

    @Test
    @Story("Чек-боксы городов")
    @DisplayName("Проверка изменения состояния чек-боксов городов")
    public void shouldChangeCityCheckbox() {

        step("Проверить, что по умолчанию чек-бокс города полностью белый", () -> {

        });

        step("Нажать на полностью белый чек-бокс города", () -> {

        });

        step("Проверить, что чекбокс города стал красным с белой галочкой, а все ПВЗ города выбраны", () -> {

        });

        step("Нажать на чек-бокс одного из выбранных ПВЗ", () -> {

        });

        step("Проверить, что чек-бокс города стал красным с белой горизонтальной полосой", () -> {

        });

        step("Нажать на чек-бокс города с белой горизонтальной полосой", () -> {

        });

        step("Проверить, что чекбокс города стал красным с белой галочкой, а все ПВЗ города выбраны", () -> {

        });

        step("Нажать на чек-бокс города с белой галочкой", () -> {

        });

        step("Проверить, что чек-бокс города стал полностью белым, произошла отмена выбора всех ПВЗ города", () -> {

        });

    }

    @Test
    @Story("Текстовая подсказка в блоке ПВЗ")
    @DisplayName("Проверка появления текстовой подсказки в блоке ПВЗ")
    public void shouldAppearTooltip() {

        step("Нажать на название города в блоке городов", () -> {

        });

        step("Нажать на иконку со знаком вопроса в блоке ПВЗ", () -> {

        });

        step("Проверить, что отобразилась текстовая подсказка", () -> {

        });

    }

    @Test
    @Story("Номера маршрутов в блоке ПВЗ")
    @DisplayName("Проверка отображения номеров маршрутов в блоке ПВЗ")
    public void shouldSeeRouteNumber() {

        step("Нажать на название города в блоке городов", () -> {

        });

        step("Проверить, что в чекбоксах блока ПВЗ отображаются номера маршрутов", () -> {

        });

    }

    @Test
    @Story("Чек-боксы стен упаковки")
    @DisplayName("Проверка изменения состояния чек-боксов стен упаковки")
    public void shouldChangeWallCheckbox() {

        step("Нажать на активный чек-бокс в блоке стен упаковки", () -> {

        });

        step("Проверить, что чек-бокс стал красным с белой галочкой", () -> {

        });

        step("Нажать на неактивный чек-бокс в блоке стен упаковки", () -> {

        });

        step("Проверить, что состояние чек-бокса не изменилось", () -> {

        });

    }

    @Test
    @Story("Закрытие модального окна")
    @DisplayName("Проверка закрытия модального окна без сохранения изменений")
    public void shouldCloseModal() {

        step("Нажать на полностью белый чек-бокс города", () -> {

        });

        step("Нажать на активный чек-бокс стены упаковки", () -> {

        });

        step("Кликнуть на область для закрытия модального окна", () -> {

        });

        step("Проверить, что появилось предупреждение о том, что изменения не будут сохранены", () -> {

        });

        step("Кликнуть на 'Нет'", () -> {

        });

        step("Проверить, что предупреждение не отображается, а модальное окно осталось открытым", () -> {

        });

        step("Кликнуть на область для закрытия модального окна", () -> {

        });

        step("Кликнуть на 'Да'", () -> {

        });

        step("Проверить, что модальное окно закрылось", () -> {

        });

        step("Кликнуть по кнопке 'Добавить маршрут'", () -> {

        });

        step("Проверить, что выбранные до закрытия модального окна чек-боксы городов и стен упаковки не отмечены выбранными'", () -> {

        });

    }

    @Test
    @Story("Сохранение изменений в модальном окне")
    @DisplayName("Проверка сохранения изменений в модальном окне")
    public void shouldSaveChanges() {

        step("Нажать на полностью белый чек-бокс города", () -> {

        });

        step("Нажать на активный чек-бокс стены упаковки", () -> {

        });

        step("Проверить, что кнопка 'Сохранить' стала активной", () -> {

        });

        step("Кликнуть по кнопке 'Сохранить'", () -> {

        });

        step("Проверить, что новый маршрут добавлен в список на странице 'Маршруты'", () -> {

        });

    }

}
