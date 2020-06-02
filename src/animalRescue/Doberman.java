package animalRescue;

import java.sql.SQLOutput;

public class Doberman extends Dog {
    @Override
    public void run() {
        System.out.println("40kph");

    }

    @Override
    public void ill() {
        System.out.println("specific doberman ear illness");

    }

    @Override
    public void speak() {
        System.out.println("woooOOOooof");

    }

    @Override
    public void sleep() {
        System.out.println("snores");

    }
}
