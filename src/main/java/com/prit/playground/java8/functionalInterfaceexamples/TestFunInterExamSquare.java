package com.prit.playground.java8.functionalInterfaceexamples;
/**
 * Important Points/Observations:
 *
 * 1> A functional interface has only one abstract method but it can have multiple default methods.
 * 2> @FunctionalInterface annotation is used to ensure an interface can’t have more than one abstract method.
 *    The use of this annotation is optional.
 * 3> The java.util.function package contains many builtin functional interfaces in Java 8.
 * 4> @FunctionalInterface annotation is used to ensure that the functional interface can’t have more than
 *     one abstract method. In case more than one abstract methods are present, the compiler flags
 *     an ‘Unexpected @FunctionalInterface annotation’ message. However, it is not mandatory to use this annotation.
 * */
@FunctionalInterface
 interface Square {
    int calculate(int x);
}
public class TestFunInterExamSquare {
    public static void main(String args[])
    {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x)->x*x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}
