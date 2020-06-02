package animalRescue;

import java.sql.SQLOutput;

public abstract class Duck extends Animal{

    public void speak(){
        System.out.println("Quak");
    }
    public void eat() {
        System.out.println("eats duckfood");
    }
}
