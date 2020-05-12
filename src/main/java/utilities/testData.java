package utilities;

import com.github.javafaker.Faker;

public class testData {
    static Faker faker = new Faker();

    public static String testEmail = faker.internet().emailAddress();
}
