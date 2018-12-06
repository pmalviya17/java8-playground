package com.prit.playground.java8.functionalInterfaceexamples;

public class TestFunInterExamRunnableThread {
    public static void main(String args[])
    {
        /********Functional style********/
        // lambda expression to create the object
        new Thread(()->
        {System.out.println("New thread created by \"Functional style\"");}).start();


        /********NON-Functional style********/
        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("New thread created by \"NON Functional style\"");
            }
        }).start();
    }
}
