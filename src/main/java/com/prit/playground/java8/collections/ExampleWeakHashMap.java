package com.prit.playground.java8.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.WeakHashMap;

public class ExampleWeakHashMap {
    public static void main(String[] args) {
        Map<Order, Integer> order = new WeakHashMap<>(); // Please note the java 8 feature where no Type is required at the time of initialization
        order.put(new Order(1,"ABCD"),100);
        order.put(new Order(2,"ABCD"),200);
        order.put(new Order(3,"ABCD"),300);
        order.put(new Order(4,"ABCD"),400);

        System.out.println("BEFORE GC : "+order.size());
        System.gc(); // Please note there is no guarantee if GC collects the weak reference on this call
        System.out.println("AFTER GC : "+order.size());

    }
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Order {
    int orderId;
    String details;
}
