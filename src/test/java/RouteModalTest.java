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
    @Story("Поиск по городам и ПВЗ")
    @DisplayName("Проверка успешного поиска по городам и ПВЗ")
    public void shouldSearchCityDPTest() {

        step("При вводе в инпут названия города в блоке городов отображается город с введенным названием", () -> {

        });

        step("При вводе в инпут названия ПВЗ в блоке ПВЗ отображается пункт выдачи с введенным названием", () -> {

        });

    }

    @Test
    @Story("Блок ПВЗ")
    @DisplayName("Проверка отображения данных в блоке ПВЗ")
    public void shouldSeeDPInfo() {

        step("При клике по названию города отображается список ПВЗ по выбранному городу", () -> {

        });

        step("При клике по иконке со знаком вопроса отображается текстовая подсказка", () -> {

        });

        step("В чекбоксах ПВЗ отображаются номера маршрутов, привязанные к выбранным городам и пунктам выдачи", () -> {

        });
    }

    @Test
    @Story("Чек-боксы городов")
    @DisplayName("Проверка изменения состояния чек-боксов городов")
    public void shouldChangeCityCheckbox() {

        step("Чек-бокс города по умолчанию полностью белый", () -> {

        });

        step("Полностью белый чек-бокс города при клике по нему становится красным с белой галочкой, а все ПВЗ этого города отмечаются выбранными", () -> {

        });

        step("Красный с белой галочкой чек-бокс города при клике по чек-боксу одного из ПВЗ этого города становится красным с белой горизонтальной полосой", () -> {

        });

        step("Красный с белой горизонтальной полосой чекбокс города становится красным с белой галочкой при клике по нему, а все ПВЗ этого города отмечаются выбранными", () -> {

        });

        step("Красный с белой галочкой чек-бокс города становится полностью белым при клике по нему, и происходит отмена выбора всех ПВЗ этого города", () -> {

        });

    }

    @Test
    @Story("Чек-боксы стен упаковки")
    @DisplayName("Проверка изменения состояния чек-боксов стен упаковки")
    public void shouldChangeWallCheckbox() {

        step("Пустой активный чек-бокс в блоке стен упаковки становится красным с белой галочкой при клике по нему", () -> {

        });

        step("Неактивный чек-бокс не меняет своего состояния при клике по нему", () -> {

        });

    }

    @Test
    @Story("Закрытие модального окна")
    @DisplayName("Проверка закрытия модального окна без сохранения изменений")
    public void shouldCloseModal() {

        step("При клике по иконке крестика появляется поп-ап с предупреждением, что изменения не будут сохранены", () -> {

        });

        step("При клике по области рядом с модальным окном появляется поп-ап с предупреждением, что изменения не будут сохранены", () -> {

        });

        step("При клике по кнопке 'Нет' поп-ап с предупреждением закрывается, а модальное окно остается открытым", () -> {

        });

        step("При клике по кнопке 'Да' модальное окно закрывается, внесенные изменения не сохраняются", () -> {

        });

    }

    @Test
    @Story("Сохранение изменений")
    @DisplayName("Проверка сохранения изменений в модальном окне")
    public void shouldSaveChanges() {

        step("При клике по кнопке 'Сохранить' модальное окно закрывается, внесенные изменения сохраняются", () -> {

        });

    }

}
