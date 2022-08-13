package com.johnniewalker.tests.utils;

import java.util.Random;

public class RandomGenerator {
    public static String randomMonths() {

        String[] month = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "Dezember"};
        String random = (month[new Random().nextInt(month.length)]);
        return random;
    }
}
