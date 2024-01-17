package com.estudos;

import static com.estudos.converter.Converter.converter;

public class Main {
    public static void main(String[] args) {
        double amountInUSD = 100.0;
        String coinOf = "USD";
        String coinFor = "EUR";

        try {
            double result = converter(amountInUSD,coinOf,coinFor);
            System.out.println(amountInUSD + " " + coinOf + " is equivalent to: " + result + " " + coinFor + "."
            );
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
