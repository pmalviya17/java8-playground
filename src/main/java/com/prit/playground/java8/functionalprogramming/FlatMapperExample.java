package com.prit.playground.java8.functionalprogramming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapperExample {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Peter", 20, Arrays.asList("1", "2")),
                new User("Sam", 40, Arrays.asList("3", "4", "5")),
                new User("Ryan", 60, Arrays.asList("6")),
                new User("Adam", 70, Arrays.asList("7", "8"))
        );


        System.out.println("Functional Style: ");


        Optional<String> stringOptional = users.stream()
                .map(user -> user.getPhoneNumbers().stream())
                .flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("10")))
                .findAny();

        stringOptional.ifPresent(System.out::println);

    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }


@Data
@AllArgsConstructor
    static class User {
        private String name;
        private Integer age = 30;
        private List<String> phoneNumbers;

    }
}