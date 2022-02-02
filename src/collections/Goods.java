package collections;

public class Goods {

    private String name;
    private double weight;
    private String dateOfManufact;

    public Goods(String name, double weight, String dateOfManufact) {
        this.name = name;
        this.weight = weight;
        this.dateOfManufact = dateOfManufact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDateOfManufact() {
        return dateOfManufact;
    }

    public void setDateOfManufact(String dateOfManufact) {
        this.dateOfManufact = dateOfManufact;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", dateOfManufact='" + dateOfManufact + '\'' +
                '}';
    }
}

