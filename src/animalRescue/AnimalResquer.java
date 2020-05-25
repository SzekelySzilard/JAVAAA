package animalRescue;

public class AnimalResquer   extends Human{

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public int money;


        public void feed() {
            System.out.println("feeding the animal ");
        }

        public void treatment() {
            System.out.println(" giving treatment to animal");
        }

        public void vet() {
            System.out.println("takes animal to vet ");
        }

        public void buy() {
            System.out.println(" buys food for the animal");
        }



    }

