package com.prit.playground.java8.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Points to remember :
 * 1> Map is an associative array data structure of key value pair.
 * 2> NULL is allowed as key in HashMap and by default there hashcode index is at 0th position in array of the table of NODES.
 * 3> HashMap stores their key value pair by using hashcode value in form of linked list which later used to find the index position
 *    in the allocated table bucket/nodes, Please use below link to understand how HashMap works:
 *    https://www.youtube.com/watch?v=c3RVW3KGIIE
 *    Also, You can refer below link for
 *
 */
public class ExampleConcurrentModificationException {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("User1",4);
        scores.put("User2",4);
        scores.put("User3",4);
        scores.put("User4",4);
        scores.put("User5",4);
        scores.put("User6",4);
        scores.put("User7",4);

        Iterator<String> usrIt = scores.keySet().iterator();
        while (usrIt.hasNext()){
            System.out.println(""+ usrIt.next());
            scores.put("User8",4); // This statement will throw runtime exception "ConcurrentModificationException"
        }
    }
}
