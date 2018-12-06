package com.prit.playground.java8.functionalInterfaceexamples.builtinfunctionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * The Predicate interface has an abstract method test which gives a Boolean value as a result for the specified argument.
 * Its prototype is
 *
 * public Predicate
 * {
 *    public boolean test(T  t);
 *  }
 * */
public class TestPredicateInterface {
    public static void main(String args[])
    {

        // create a list of strings
        List<String> names =
                Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");

        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s)->s.startsWith("G");

        // Iterate through the list
        for (String st:names)
        {
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }
    }
}
