package com.prit.playground.java8.functionalInterfaceexamples.builtinfunctionalinterfaces;

import jdk.internal.org.objectweb.asm.Opcodes;

import java.util.ArrayList;

public class CD {
    ArrayList l;
    CD (){

    }
    int CD (int i){
        l = new ArrayList();
        return i;
    }
    void add(){
        l.add("");
    }

    static String s ="I";

    public static void main(String[] args) {
        //CD cd = new CD(1);
        //Student s = new Student();
        //String str = "Student";
        //System.out.println(str Instanceof Student);
        StringBuffer sb = new StringBuffer("a");
        sb.append("Test");
        System.out.println(sb.capacity());
        System.out.println(sb.length());


        Student s1 = new Student(10);
        Student s2 = new Student(35);
        s1.sid = s1.sid +10;
        System.out.println(s1.sid);

        //int i = 0;
        //for (int i = 0; i<2; i++){
        int l= 12;
         switch (l){
             case 0 : break;
             case 1:
                 System.out.println("aa");
             case 2:
                 System.out.println("ba");
         }

String s = "Local";
    }


}

class Student{
    static int sid;
    Student(int id){
        this.sid  = id;
    }
}
