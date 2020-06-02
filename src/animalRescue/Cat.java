package animalRescue;

public abstract class Cat extends Animal {


    private String prefPlay;


    public String getPrefPlay() {
        return prefPlay;
    }

    public void setPrefPlay(String prefPlay) {
        this.prefPlay = prefPlay;
    }


    public void eat() {
        System.out.println("purina");

    }
}


