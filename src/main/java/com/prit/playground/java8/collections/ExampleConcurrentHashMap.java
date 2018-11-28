package com.prit.playground.java8.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Please note Null value as KEY is not allowed as multiple threads are updating and due to which a locking mechanism is required
 * if in case want to see it contains in the object.
 * Also note that no contains() method available in this class and again same reason of multiple updates on the same object allowed.
 */
public class ExampleConcurrentHashMap {
    static Map<String, Long> orders = new ConcurrentHashMap<>();
    static Map<String, AtomicLong> ordersWithAtomicLong = new ConcurrentHashMap<>();
    public static void main(String[] args) throws InterruptedException {
        for(int i =0 ; i<=100 ; i++) {
            /** Without Atomic variables*/
            processWithoutAtomicLong();

            /** With Atomic variables*/
            processWithAtomicLong();
        }
    }

    private static void processWithAtomicLong() throws InterruptedException {
        ordersWithAtomicLong.put("Bombay", new AtomicLong());
        ordersWithAtomicLong.put("Tokyo", new AtomicLong());
        ordersWithAtomicLong.put("London", new AtomicLong());
        ordersWithAtomicLong.put("New york", new AtomicLong());

        ExecutorService executorServiceWithAtomicLong = Executors.newFixedThreadPool(2);
        executorServiceWithAtomicLong.submit(ExampleConcurrentHashMap::processOrderWithAtomicLong);
        executorServiceWithAtomicLong.submit(ExampleConcurrentHashMap::processOrderWithAtomicLong);

        executorServiceWithAtomicLong.awaitTermination(1, TimeUnit.SECONDS);

        executorServiceWithAtomicLong.shutdown();

        System.out.println("With Atomic ***** " +ordersWithAtomicLong);
    }
    static void processOrderWithAtomicLong(){
        for(String city : ordersWithAtomicLong.keySet()){
            for (int i = 0; i<50 ; i++) {
                ordersWithAtomicLong.get(city).getAndIncrement();   /** "put()" NON-Atomic operations */
            }
        }
    }
    /** Without Atomic variables*/
    private static void processWithoutAtomicLong() throws InterruptedException {

        orders.put("Bombay", 0l);
        orders.put("Tokyo", 0l);
        orders.put("London", 0l);
        orders.put("New york", 0l);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(ExampleConcurrentHashMap::processOrder);
        executorService.submit(ExampleConcurrentHashMap::processOrder);

        executorService.awaitTermination(1, TimeUnit.SECONDS);

        executorService.shutdown();

        System.out.println("Without Atomic ---- " + orders);
    }

    static void processOrder(){
        for(String city : orders.keySet()){
          for (int i = 0; i<50 ; i++) {
              Long oldOrder = orders.get(city); /** "get()" NON-Atomic operations */
              orders.put(city, oldOrder + 1);   /** "put()" NON-Atomic operations */
          }
        }
    }
}
