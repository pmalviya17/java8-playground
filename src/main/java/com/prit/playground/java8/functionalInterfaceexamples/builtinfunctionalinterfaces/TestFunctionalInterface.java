package com.prit.playground.java8.functionalInterfaceexamples.builtinfunctionalinterfaces;

import java.util.function.*;

public class TestFunctionalInterface {
    public static void main(String[] args) {
        System.out.println("~~~~~~Starting BiConsumer-->");
        BiConsumer<String, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept("java2s.com", " tutorials");
        System.out.println("<--Ending BiConsumer~~~~~~");

        System.out.println("~~~~~~Starting BiFunction-->");
        /**BiFunction represents a function that accepts two arguments and produces a result. This is the
         * two-arity specialization of Function.*/
        BiFunction<String, String,String> bi = (x, y) -> {
            return x + y;
        };
        System.out.println(bi.apply("java2s.com", " tutorial"));
        System.out.println("<--Ending BiFunction~~~~~~");

        System.out.println("~~~~~~Starting BinaryOperator-->");
        /**BinaryOperator represents an operation upon two operands of the same type, producing a result of the same
         * type.*/
        BinaryOperator<Integer> adder = (n1, n2) -> n1 + n2;

        System.out.println(adder.apply(3, 4));
        System.out.println("<--Ending BinaryOperator~~~~~~");

        System.out.println("~~~~~~Starting BiPredicate-->");
        /**BiPredicate represents a predicate which is a boolean-valued function of two arguments.*/
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x > y;
        System.out.println(biPredicate.test(2, 3));
        System.out.println("<--Ending BiPredicate~~~~~~");

        System.out.println("~~~~~~Starting BooleanSupplier-->");
        /**BooleanSupplier represents a supplier of boolean-valued results.*/
        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean());

        int x = 0, y= 1;
        booleanSupplier = () -> x > y;
        System.out.println(booleanSupplier.getAsBoolean());
        System.out.println("<--Ending BooleanSupplier~~~~~~");

        System.out.println("~~~~~~Starting Consumer-->");
        /**Consumer interface represents an operation that accepts a single input argument and returns no result.*/
        Consumer<String> consumer = (xConsume) -> System.out.println(xConsume.toLowerCase());
        consumer.accept("Java2s.com");
        System.out.println("<--Ending Consumer~~~~~~");

        System.out.println("~~~~~~Starting DoubleBinaryOperator-->");
        /**DoubleBinaryOperator represents an operation on two double-valued operands and producing a double-valued result.*/
        DoubleBinaryOperator doubleBinaryOperator = (xDoubBinOp,yDoubBinOp) -> xDoubBinOp*yDoubBinOp;
        System.out.println(doubleBinaryOperator.applyAsDouble(0.23, 0.45));
        System.out.println("<--Ending DoubleBinaryOperator~~~~~~");

        System.out.println("~~~~~~Starting DoubleConsumer-->");
        /**DoubleConsumer functional interface represents an operation that accepts a single double-valued argument and
         * returns no result. This is the primitive type specialization of Consumer for double.
        */
        DoubleConsumer doubleConsumer = (xDblCon) -> System.out.println(xDblCon*xDblCon);
        doubleConsumer.accept(0.23);
        System.out.println("<--Ending DoubleConsumer~~~~~~");

        System.out.println("~~~~~~Starting DoubleFunction-->");
        /**DoubleFunction represents a function that accepts a double-valued argument and produces a result.
         * This is the double-consuming primitive specialization for Function.*/
        DoubleFunction<String> doubleFunction = (dDblFunc) -> dDblFunc +" is now a string";

        System.out.println(doubleFunction.apply(0.5));
        System.out.println("<--Ending DoubleFunction~~~~~~");

        System.out.println("~~~~~~Starting DoublePredicate-->");
        /***/
        DoublePredicate doublePredicate = (dblpred) -> dblpred > 0;
        System.out.println(doublePredicate.test(0.5));
        System.out.println("<--Ending DoublePredicate~~~~~~");

        System.out.println("~~~~~~Starting DoubleSupplier-->");
        /**DoubleSupplier represents a supplier of double-valued results. This is the double-producing primitive
         * specialization of Supplier.*/
        DoubleSupplier pDoubleSupplier = () -> {return 3.14d;};
        System.out.println(pDoubleSupplier.getAsDouble());
        System.out.println("<--Ending DoubleSupplier~~~~~~");

        System.out.println("~~~~~~Starting DoubleToIntFunction-->");
        /***/
        DoubleToIntFunction doubleToIntFunction = (xDoubleToIntFunction) -> {return (int)xDoubleToIntFunction+2;};


        System.out.println(doubleToIntFunction.applyAsInt(3.14));
        System.out.println("<--Ending DoubleToIntFunction~~~~~~");

        System.out.println("~~~~~~Starting BiFunction-->");
        /***/
        System.out.println("<--Ending BiFunction~~~~~~");

        System.out.println("~~~~~~Starting BiFunction-->");
        /***/
        System.out.println("<--Ending BiFunction~~~~~~");

        System.out.println("~~~~~~Starting BiFunction-->");
        /***/
        System.out.println("<--Ending BiFunction~~~~~~");

        System.out.println("~~~~~~Starting BiFunction-->");
        /***/
        System.out.println("<--Ending BiFunction~~~~~~");

        System.out.println("~~~~~~Starting BiFunction-->");
        /***/
        System.out.println("<--Ending BiFunction~~~~~~");

        System.out.println("~~~~~~Starting BiFunction-->");
        /***/
        System.out.println("<--Ending BiFunction~~~~~~");

        System.out.println("~~~~~~Starting BiFunction-->");
        /***/
        System.out.println("<--Ending BiFunction~~~~~~");

        System.out.println("~~~~~~Starting BiFunction-->");
        /***/
        System.out.println("<--Ending BiFunction~~~~~~");

        System.out.println("~~~~~~Starting BiFunction-->");
        /***/
        System.out.println("<--Ending BiFunction~~~~~~");

        System.out.println("~~~~~~Starting BiFunction-->");
        /***/
        System.out.println("<--Ending BiFunction~~~~~~");
    }
}
