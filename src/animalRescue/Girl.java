package animalRescue;

public class Girl {
    public String name;
    public int money;

public String getName(){
    return name;
}
     public void setName(String name){
    this.name=name;
     }
     1
     public int getMoney(){
    return money;
     }

    public void setMoney(int money) {
        this.money = money;
    }


    public void feed() {
        System.out.println("feeding the dog ");
    }
    public void treatment() {
        System.out.println(" giving treatment to dog");
    }
    public void vet() {
        System.out.println("takes dog to vet ");
    }
    public void buy() {
        System.out.println(" buys food for the dog");
    }
    public void run() {
        System.out.println("takes dog for a run ");
    }
}
