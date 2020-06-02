package animalRescue;

public abstract class Dog extends Animal{


    private String prefPlay;



    public String getPrefPlay(){
        return prefPlay;
    }
    public void setPrefPlay( String prefPlay ){
        this.prefPlay = prefPlay;
    }


    public abstract void run();

    public void eat(){
        System.out.println("pdigreee");
    }

    }



