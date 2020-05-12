package animalRescue;

public class Cat extends Animal {

    private String prefPlay;


    public String getPrefPlay() {
        return prefPlay;
    }

    public void setPrefPlay(String prefPlay) {
        this.prefPlay = prefPlay;
    }

    public void run(){
        System.out.println("running..");
    }

}


