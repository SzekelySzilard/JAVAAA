package animalRescue;

public class Girl extends AnimalResquer{

    @Override
    public void feed() {
        System.out.println("feeds sphinx");

    }

    @Override
    public void treatment() {
        System.out.println("gives pills");

    }


    @Override
    public void buy() {
        System.out.println(" buys purina");

    }

    public void run() {
        System.out.println("takes cat for a run ");
    }

    @Override
    public void speak() {
        System.out.println("speaks to cat");

    }


}
