package com.example.demo.interfaces;

public interface Currency {
    String SYMBOL = "$";
    double convertToUSD(double amount);

    private void log(String message) {
        System.out.println("Log: " + message);
    }

    default void show() {
        log("Showing data...");
    }
}
