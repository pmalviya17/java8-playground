package com.prit.playground.java8.functionalInterfaceexamples.builtinfunctionalinterfaces;

import java.io.IOException;

import java.sql.Array;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TestTmp {
    public static void main(String[] args) {
        HashMap hashMap;
        Hashtable hashtable = new Hashtable();
        hashtable.put("","");
        hashtable.put(10,"");
        hashtable.put("",108.01);
        Map map;
        TreeMap treeMap;



        int i = check();
        System.out.println(i);
    }

    private static int check() {
        try{
            System.out.println("A");
            //System.exit(0);

            return 1;
        }catch(Exception e){
            System.out.println("B");
            return 2;
        }finally {

            System.out.println("C");
            return 3;
        }

    }
    private static int check2() {
        try{
            //throw new IOException();
            return 1;
        }catch(Exception e){
            System.out.println("B");
            return 2;
        }finally {
            System.out.println("C");
            return 3;
        }

    }
}
