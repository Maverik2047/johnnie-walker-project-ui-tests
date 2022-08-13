package com.johnniewalker.tests.utils;

import java.util.Random;

public class RandomGenerator {
    public static String randomMonths() {

        String[] month = {"December", "October", "January", "June", "July", "September", "November", "February"};
        String random = (month[new Random().nextInt(month.length)]);
        return random;
    }
}
