package com.johnniewalker.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.johnniewalker.config.CredConfig;
import com.johnniewalker.pages.AgeVerificationPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.johnniewalker.helpers.AllureAttachments.*;

public class TestBase {
    static CredConfig config = ConfigFactory.create(CredConfig.class);
    TestData testData = new TestData();
    AgeVerificationPage ageVerificationPage = new AgeVerificationPage();

    @BeforeAll
    static void beforeAll() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.browserCapabilities = capabilities;
        Configuration.baseUrl = config.baseUrl();
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("version", "100");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.holdBrowserOpen = true;

        String remoteDriverUrl = System.getProperty("remoteDriverUrl", "selenoid.autotests.cloud/wd/hub");
        Configuration.remote = String.format("https://%s:%s@%s", config.login(), config.password(), remoteDriverUrl);

    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void afterEach() {

        screenshotAs("Last screenshot");
        pageSource();
        browserConsoleLogs();
        addVideo();
        Selenide.closeWindow();
    }
}