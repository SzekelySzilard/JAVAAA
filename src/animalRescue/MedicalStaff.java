package animalRescue;

public  class MedicalStaff extends Human{

    public String spec;


    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void consult() {
        System.out.println("consults animal");
    }

    public void suggestTreatment() {
        System.out.println("suggests treatment to animal resquer");
    }

    @Override
    public void speak() {
        System.out.println("speaks with pet owner");
    }
}
