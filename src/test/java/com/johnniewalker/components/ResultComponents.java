package com.johnniewalker.components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class ResultComponents {
    public void checkSuccessfulEnter() {
        $(".navigation-primary-container").shouldHave(Condition.text("Visit Johnnie Walker " +
                "Princes Street"));
    }

    public void checkUnsuccessfulEnter() {
        $("#age_missing_message").shouldHave(Condition.text("Sorry, your age or location " +
                "does not permit you to enter at this time."));
    }
}
