package com.prit.playground.java8.functionalInterfaceexamples.builtinfunctionalinterfaces;

import java.io.*;
import java.util.*;

class Solution
{
    public static void main(String [] args) throws Exception
    {
        query1();
    }

    private static void query1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int t = 0; t < n; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
