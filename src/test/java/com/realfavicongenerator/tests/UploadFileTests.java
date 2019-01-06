package com.realfavicongenerator.tests;

import com.realfavicongenerator.data.TestData;
import org.testng.annotations.Test;
import pages.FavIconPage;
import pages.MainPage;
import pages.ModalWindow;
import pages.ResultFavIconPage;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;

public class UploadFileTests extends BaseTest {

    @Test(priority = 1)
    public void testCanUploadRectangleImage() {
        File image = TestData.getRectangleImage();
        //given
        MainPage
                .open()
                .upload(image);
        //when
        new ModalWindow().confirm();
        //then
        new FavIconPage()
                .macOsLabel.should(visible);
    }

    @Test(priority = 2)
    public void testCanUploadCircleImage() {
        File image = TestData.getCircleImage();
        //given
        MainPage
                .open()
                .upload(image);
        //when
        new ModalWindow().confirm();
        //then
        new FavIconPage()
                .macOsLabel.should(visible);
    }

    @Test(priority = 3)
    public void testCanDownloadGeneratingHtmlAndIcons() {
        File image = TestData.getImage();
        //given
        MainPage
                .open()
                .upload(image);
        //when
        new FavIconPage()
                .generateFavIcon();
        //then
        new ResultFavIconPage()
                .packageButtons.shouldHaveSize(3);
    }
}
