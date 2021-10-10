package tests.demoqa;

import com.github.javafaker.Faker;

public class TestDataWithFaker {

    static Faker faker = new Faker();

    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = "Male",
            phone = faker.phoneNumber().subscriberNumber(10),
            month = "July",
            year = "2005",
            day = "16",
            subject = "Math",
            hobby = "Reading",
            fileName = "img/img1.jpg",
            fileNameShort = fileName.replaceAll("^(.+/)", ""),
            currentAddress = faker.address().streetAddress(),
            state = "NCR",
            city = "Delhi";
}