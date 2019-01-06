package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class ResultFavIconPage {
    public ElementsCollection packageButtons = $$("#favicon_install_instructions_for_html a");

    @Step("download package")
    public void downloadFavIconPackage() {
        $x("(//*[@class=\"favicon_package\"]/a)[1]").click();
    }
}
