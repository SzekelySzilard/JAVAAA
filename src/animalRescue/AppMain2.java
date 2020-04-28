package animalRescue;

public class AppMain2 {

    public static void main(String[] args) {
        Dog Rex= new Dog();

        Rex.setName("Rex");
        Rex.setAge(4);
        Rex.sethealth(9);
        Rex.setHunger(10);
        Rex.setMood(6);
        Rex.setPrefFood("purina");
        Rex.setPrefPlay("run");


     Food Food= new Food();

     Food.setName("Purina");
     Food.setAvailable(true);
     Food.setPrice(19);

     Girl Girl= new Girl();

     Girl.setName("Krisztina");
     Girl.setMoney(200);
     
     Vet Vet= new Vet();

     Vet.setName("Doolittle");
     Vet.setSpec("Dog");
    }


}
