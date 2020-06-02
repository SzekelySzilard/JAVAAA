package animalRescue;

public class Sphinx extends Cat {
    @Override
    public void ill() {
        System.out.println("specific Sphinx ilness");

    }

    @Override
    public void speak() {
        System.out.println("miau");

    }

    @Override
    public void sleep() {
        System.out.println("sleeps quietly");

    }
}
