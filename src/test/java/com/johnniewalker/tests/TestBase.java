package com.johnniewalker.tests;

import com.codeborne.selenide.Configuration;
import com.johnniewalker.pages.AgeVerificationPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    TestData testData = new TestData();
    AgeVerificationPage ageVerificationPage = new AgeVerificationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.johnniewalker.com/";
        Configuration.browserSize = "1800x900";
        Configuration.holdBrowserOpen = true;


    }
}
