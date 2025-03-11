package com.example;

public class Sum {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int result = sum.add(5, 7);
        System.out.println("Sum: " + result);
    }
}

