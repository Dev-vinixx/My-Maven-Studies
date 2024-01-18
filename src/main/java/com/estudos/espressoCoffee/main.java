package com.estudos.espressoCoffee;

import com.estudos.espressoCoffee.revenue.Revenue;

public class main {
    public static void main(String[] args) {
        try {
            Revenue newCoffee = new Revenue(3, 3, 2700, true, true, true);
            newCoffee.CreateStrainerWithCoffee();
            newCoffee.CreateHotWater();
            newCoffee.MakeCoffee();
            newCoffee.DrinkCoffee();
        } catch (RuntimeException e) {
            System.out.println("error: " + e.getMessage());
        }

    }

}
