package com.johnniewalker.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class JohnnieWalkerEnterTests extends TestBase {
    @Test
    @Tag("ageCheckTest")
    @Owner("maverik2047")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check possibility to enter after 18 years")
    @DisplayName("Successful age validation test")
    void ageSuccessfulValidationTest() {
        ageVerificationPage.openPage()
                .setDayOfBirth(testData.day)
                .setMonthOfBirth(testData.month)
                .setYearOfBirth(testData.year)
                .pressSubmit()
                .checkSuccessfulEnter();

    }

    @Test
    @Tag("underAgeCheckTest")
    @Owner("maverik2047")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check that is not possible to enter under 18 years")
    @DisplayName("Unsuccessful age validation test")
    void ageUnSuccessfulValidationTest() {
        ageVerificationPage.openPage()
                .acceptCookies()
                .setDayOfBirth(testData.day)
                .setMonthOfBirth(testData.month)
                .setYearOfBirth("2006")
                .pressSubmit()
                .checkUnsuccessfulEnter();
    }
}