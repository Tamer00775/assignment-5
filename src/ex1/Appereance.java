package ex1;

public class Appereance {
    private Double height;
    private Double weight;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Appereance{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
