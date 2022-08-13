package com.johnniewalker.pages;

import com.codeborne.selenide.SelenideElement;
import com.johnniewalker.components.ResultComponents;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AgeVerificationPage {
    ResultComponents resultComponents = new ResultComponents();

    SelenideElement birthDay = $("#age_select_day"),
            birthMonth = $("#age_select_month"),
            birthYear = $("#age_select_year"),
            acceptCookies = $("#onetrust-accept-btn-handler"),
            userSubmit = $("#age_confirm_btn");

    public AgeVerificationPage openPage() {
        open("");
        acceptCookies.click();
        return this;
    }

    public AgeVerificationPage setDayOfBirth(String value) {
        birthDay.selectOption(value);
        return this;
    }

    public AgeVerificationPage setMonthOfBirth(String value) {
        birthMonth.selectOption(value);
        return this;
    }

    public AgeVerificationPage setYearOfBirth(String value) {
        birthYear.selectOption(value);
        return this;
    }

    public AgeVerificationPage pressSubmit() {
        userSubmit.click();
        return this;
    }

    public AgeVerificationPage checkSuccessfulEnter() {
        resultComponents.checkSuccessfulEnter();
        return this;
    }

    public AgeVerificationPage checkUnsuccessfulEnter() {
        resultComponents.checkUnsuccessfulEnter();
        return this;
    }
}
