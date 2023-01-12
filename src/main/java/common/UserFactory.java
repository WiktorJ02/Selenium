package common;

import com.github.javafaker.Faker;

import java.util.Random;

public class UserFactory {

    Faker faker = new Faker();

    public User getRandomUser() {
        Random rand = new Random();

        return new User.UserBuilder()
                .userName(String.valueOf(faker.name().username()))
                .email(String.valueOf(faker.internet().emailAddress()))
                .password(String.valueOf(faker.internet().password()))
                .phoneNumber(String.valueOf(faker.number().numberBetween(100000000, 999999999)))
                .build();

    }

    public User getAlreadyRegisteredUser() {
        return new User.UserBuilder()
                .userName("Wiktor")
                .email("qwerty@qwe.pl")
                .password("rahulshettyacademy")
                .phoneNumber("123456789")
                .build();
    }
}

