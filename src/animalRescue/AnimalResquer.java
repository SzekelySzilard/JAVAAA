package animalRescue;

public class AnimalResquer {

    public class Girl {
        public String name;
        public int money;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }


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
}
