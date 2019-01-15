package com.prit.playground.java8.functionalInterfaceexamples.builtinfunctionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * The BinaryOperator interface has an abstract method apply which takes two argument and returns a result of same type. Its prototype is
 * public interface BinaryOperator
 * {
 *      public T apply(T x, T y);
 * }
 * */
public class TestBinaryOperatorInterface {
    public static void main(String args[])
    {
        BinaryOperator<Integer> adder = (n1, n2) -> n1 + n2;
        System.out.println(adder.apply(3, 4));

        BinaryOperator<Integer> substractor = (n1, n2) -> n1 - n2;
        System.out.println(substractor.apply(3, 4));

    }
}
