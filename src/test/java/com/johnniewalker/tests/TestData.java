package com.johnniewalker.tests;

import com.github.javafaker.Faker;
import com.johnniewalker.tests.utils.RandomGenerator;

import java.util.Locale;

public class TestData {


    Faker faker = new Faker(Locale.GERMANY);
    String day = String.valueOf(faker.number().numberBetween(1, 31)),
            month = RandomGenerator.randomMonths(),
            year = String.valueOf(faker.number().numberBetween(1989, 2000));
}
