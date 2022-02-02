package collections;

public class Goods {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDateOfManufact() {
        return dateOfManufact;
    }

    public void setDateOfManufact(String dateOfManufact) {
        this.dateOfManufact = dateOfManufact;
    }

    private String name;
    private int weight;
    private String dateOfManufact;

    public Goods(String name,int weight, String dateOfManufact) {
        this.name = name;
        this.weight = weight;
        this.dateOfManufact = dateOfManufact;

    }

}
