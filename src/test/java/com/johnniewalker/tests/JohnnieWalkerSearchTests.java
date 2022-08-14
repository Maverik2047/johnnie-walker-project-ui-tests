package com.johnniewalker.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class JohnnieWalkerSearchTests extends TestBase {
    @Test
    @Story("Johnnie Walker")
    @Feature("Whisky Cocktails")
    @DisplayName("Search for Whisky cocktails with Lambda steps")
    public void cocktailsSearchTest() {
        step("Open Johnnie Walker web site", () -> {
            open("");
        });
        step("Click on whisky cocktails section", () -> {
            $(".navigation-primary-link-title").click();
            $(byText("Whisky Cocktails")).click();
        });
        step("Find Johnnie & Ginger cocktail", () -> {
            $(".jw-content-wrapper").shouldBe(Condition.visible);
            $(byText("Johnnie & Ginger")).click();
        });
        step("Find whisky cocktails receipts", () -> {
            $(".cta.heading-03.block").click();
            $(".jw-content-wrapper ").shouldHave(text("OUR WHISKY COCKTAILS"));
        });
        step("Check for Johnnie & Lemon recipe", () -> {
            $(".call-to-action.headline-06").click();
            String expectedTitle = "Johnnie & Lemon | Highball | Johnnie Walker";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });

    }

    @Test
    @Story("Johnnie Walker")
    @Feature("The history of whisky")
    @DisplayName("Find about the history of whisky")
    public void historyOfWhiskyTest() {
        step("Open Johnnie Walker web site", () -> {
            open("");
        });
        step("Open Whisky Guide section", () -> {
            $(".navigation-primary-link-title").click();
            $(byText("Whisky Guide")).click();
        });
        step("Open more ways to experiment section", () -> {
            $(".jw-components-rebrand").click();
            $(byText("More ways to experiment")).click();
        });
        step("Open the history of whisky section", () -> {
            $(".jw-components-rebrand").click();
            $(byText("Learn about the history of whisky")).click();
        });
        step("Check the open page is correct", () -> {
            $(".content-container").shouldHave(text("The history of whisky"));
        });
    }
}