package pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.hidden;

public class MainPage {

    public static MainPage open() {
        return Selenide.open("/", MainPage.class);
    }

    @Step("upload file {image}")
    public void upload(File image) {
        $("#favicon_uploader_form div input").uploadFile(image);
        $x("(//*[@class=\"progress-bar\"])[1]").waitUntil(hidden, 10000);
    }
}
