package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.hidden;

public class ModalWindow {
    SelenideElement confitmBtn = $("#warning_modal_continue");

    @Step("accept adding transparent margins/cropping image")
    public void confirm() {
        confitmBtn.shouldBe(visible);
        confitmBtn.click(5,5);
        confitmBtn.shouldBe(hidden);
    }
}
