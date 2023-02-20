package com.gdu.k14pm;

public class Count {
    private static int count;
 public static synchronized int getCount() {
    count++;
    return count;
 }
}
