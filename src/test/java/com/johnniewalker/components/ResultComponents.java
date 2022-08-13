package com.johnniewalker.components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class ResultComponents {
    public void checkSuccessfulEnter() {
        $(".navigation-primary-container").shouldHave(Condition.text("Visit Johnnie Walker " +
                "Princes Street"));
    }

    public void checkUnsuccessfulEnter() {
        $("#age_missing_message").shouldHave(Condition.text("Entschuldigung, aufgrund Ihres Alters " +
                "oder Ihres Ortes können Sie diesmal nicht anmelden"));
    }
}
