package com.prit.playground.java8.functionalprogramming;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapperExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan", "Peter", "Sam", "Greg", "Ryan");

        System.out.println("Imperative Style: ");

        for (String name : names) {
            if (!name.equals("Sam")) {
                User user = new User(name);
                System.out.println(user);
            }
        }

        System.out.println("Functional Style: ");

        names.stream()
                .filter(p->!p.contains("Sam"))
                .map(User::new)
                .forEach(System.out::println);

        List<User> userList = names.stream()
                .filter(MapperExample::isNotSam)
                .map(User::new)
                .collect(Collectors.toList());
        System.out.println("userList-->"+userList);

        Set<User> usersSet = names.stream()
                .filter(p -> !p.contains("Sam"))
                .map(User::new)
                .collect(Collectors.toSet());
        System.out.println("usersSet-->"+usersSet);

    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }

@Data
@AllArgsConstructor
    static class User {
        private String name;
        private Integer age = 30;

        public User(String name) {
            this.name = name;
        }
    }
}
