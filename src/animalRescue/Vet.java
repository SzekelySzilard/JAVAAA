package animalRescue;

public class Vet {

    public String name;
    public String spec;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSpec(){
        return spec
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void consult() {
        System.out.println("consults dog");
    }
    public void treatment() {
        System.out.println("Applyes treatment to dog");
    }
    public void suggestTreatment() {
        System.out.println("suggests treatment to girl");
    }
}
