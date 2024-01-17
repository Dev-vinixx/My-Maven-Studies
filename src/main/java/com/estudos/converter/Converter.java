package com.estudos.converter;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;
public class Converter {
    private static final  Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("JPY", 110.0);
    }

    @Generated("Maven")
    public static double converter(double amount, String coin, String forCoin) {
        if (!exchangeRates.containsKey(coin)) {
            throw new IllegalArgumentException("Coin is not supported!");
        }
        double exchangeRateOf = exchangeRates.get(coin);
        double exchangeRateFor = exchangeRates.get(forCoin);

        return amount * (exchangeRateFor / exchangeRateOf);
    }
}