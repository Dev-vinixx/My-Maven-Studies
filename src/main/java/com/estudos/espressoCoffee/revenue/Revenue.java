package com.estudos.espressoCoffee.revenue;

public class Revenue {

    private int coffeeSpoons;
    private int paperStrainers;
    private int waterMl;
    private boolean fire;
    private boolean wearableTeapot;
    private boolean wearableCup;
    private boolean teapotHotWater;
    private boolean cupOfCoffe;
    private boolean coffeePercolator;

    public int getCoffeeSpoons() {
        return coffeeSpoons;
    }

    public int getPaperStrainers() {
        return paperStrainers;
    }

    public int getWaterMl() {
        return waterMl;
    }

    public Revenue(int coffeeSpoons, int paperStrainers, int waterMl, boolean fire, boolean wearableTeapot, boolean wearableCup) {
        this.coffeeSpoons = coffeeSpoons;
        this.paperStrainers = paperStrainers;
        this.waterMl = waterMl;
        this.fire = fire;
        this.wearableTeapot = wearableTeapot;
        this.wearableCup = wearableCup;
    }
    public void CreateStrainerWithCoffee () {
        if (coffeeSpoons < 3) {
            throw new RuntimeException("You need to have a minimum of 3 teaspoons to make this recipe.");
        } else if (paperStrainers < 0) {

            throw new RuntimeException("You need to have a minimum of 1 paper strainer to be able to make this recipe.");
        }
        coffeePercolator = true;
        coffeeSpoons -= 3;
        paperStrainers -= 1;
    }
    public void CreateHotWater() {
        if (!fire) {
            throw new RuntimeException("The teapot needs to be in good condition to use.");
        } else if (!wearableTeapot) {
            throw new RuntimeException("The fire needs to be on.");
        }
        teapotHotWater = true;
    }
    public void MakeCoffee() {
        if (!coffeePercolator) {
            throw new RuntimeException("First make a percolator with coffee.");
        } else if (!teapotHotWater) {
            throw new RuntimeException("First heat the water.");
        } else if (!wearableCup) {
            throw new RuntimeException("The cup needs to be in a good condition to be used.");
        }
        cupOfCoffe = true;
    }
     public void DrinkCoffee() {
        if (!cupOfCoffe) {
            throw new RuntimeException("You need a cup of coffee.");

        }
        cupOfCoffe = false;
        System.out.println("You drink the coffee");
     }
}
