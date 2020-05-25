package animalRescue;

public class Dog extends Animal{


    private String prefPlay;



    public String getPrefPlay(){
        return prefPlay;
    }
    public void setPrefPlay( String prefPlay ){
        this.prefPlay = prefPlay;
    }


    public void run(){
        System.out.println("running..");

    }
    public void speak(){
        System.out.println("woof");
    }
}


