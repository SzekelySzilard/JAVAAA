package animalRescue;

public abstract  class Animal extends LivingThing{

    private int health;
    private int hunger;
    private int  mood;
    private String prefFood;


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

    public abstract  void eat();

    public abstract void ill();
    public abstract  void sleep();



}
