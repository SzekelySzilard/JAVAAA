package animalRescue;

public abstract class AnimalResquer   extends Human{

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public int money;


        public abstract void feed() ;
        public abstract void treatment();
        public void vet(){
            System.out.println("takes animal to vet");
        };

        public abstract void buy();
    public abstract void run();





    }

