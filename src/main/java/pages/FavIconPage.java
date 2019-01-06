package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.enabled;

public class FavIconPage {
    public SelenideElement macOsLabel = $("#ios_favicon h2");
    public ElementsCollection progressBars = $$(".progress-striped");


    @Step("generate Favicons and HTML code")
    public ResultFavIconPage generateFavIcon() {
        $("#generate_favicon_button").waitUntil(enabled, 20000);
        $("#generate_favicon_button").click(5,5);
        return new ResultFavIconPage();
    }
}
