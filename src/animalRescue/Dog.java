package animalRescue;

public class Dog {

    private String name ;
    private int age ;
    private int health;
    private int hunger;
    private int  mood;
    private String prefFood;
    private String prefPlay;

    public String getName(){
        return name;
    }
public void setName( String name ){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

public void setAge( int age) {
        this.age= age;
    }

    public int getHealth() {
        return health;
    }

    public void sethealth( int health) {
        this.health= health;
    }
    public int getHunger() {
        return hunger;
    }

    public void setHunger( int hunger) {
        this.hunger= hunger;
    }
    public int getMood() {
        return mood;
    }

    public void setMood( int mood) {
        this.mood= mood;
    }
    public String getPrefFood(){
        return prefFood;
    }
    public void setPrefFood( String prefFood ){
        this.prefFood = prefFood;
    }
    public String getPrefPlay(){
        return prefPlay;
    }
    public void setPrefPlay( String prefPlay ){
        this.prefPlay = prefPlay;
    }




    public void eat(){
        System.out.println("Eating..");
    }

    public void run(){
        System.out.println("running..");
    }

    public void sleep(){
        System.out.println("ZzzZZzz..");
    }

    public void ill()  {
        System.out.println(" simptoms..");
    }

}

