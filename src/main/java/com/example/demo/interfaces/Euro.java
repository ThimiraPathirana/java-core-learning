package com.example.demo.interfaces;

public class Euro implements Currency{
    public double convertToUSD(double amount) {
        return amount * 1.18;
    }
}
