package com.johnniewalker.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class JohnnieWalkerSearchTests extends TestBase {
    @Test
    @Story("Johnnie Walker collection")
    @Feature("Whisky Cocktails")
    @DisplayName("Search for Whisky cocktails with Lambda steps")
    public void cocktailsSearchTest() {
//        step("Open Johnnie Walker web site", () -> {
//            open("");
//        });
//        step("Accept cookies", () -> {
//            $("#onetrust-accept-btn-handler").click();
//        });
//        step("Verify 18 years age to enter", () -> {
//            $("#age_select_day").selectOption(testData.day);
//            $("#age_select_month").selectOption(testData.month);
//            $("#age_select_year").selectOption(testData.year);
//            $("#age_confirm_btn").click();
//        });
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
            $(".jw-content-wrapper ").shouldHave(Condition.text("OUR WHISKY COCKTAILS"));
        });
        step("Check for Johnnie & Lemon recipe", () -> {
            $(".call-to-action.headline-06").click();
            String expectedTitle = "Johnnie & Lemon | Highball | Johnnie Walker";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });

    }


}


