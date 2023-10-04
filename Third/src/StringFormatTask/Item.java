package StringFormatTask;

public class Item {
    private String name;
    private double costD;
    private double costU;

    public Item(String name, double costD, double costU) {
        this.name = name;
        this.costD = costD;
        this.costU = costU;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostD() {
        return costD;
    }

    public void setCostD(double costD) {
        this.costD = costD;
    }

    public double getCostU() {
        return costU;
    }

    public void setCostU(double costU) {
        this.costU = costU;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", costD=" + costD +
                ", costU=" + costU +
                '}';
    }
}
