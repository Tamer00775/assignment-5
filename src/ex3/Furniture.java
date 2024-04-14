package ex3;

public class Furniture {
    private String name;
    private String style;
    private String material;
    private Double price;

    public Furniture(String name, String style, String material, Double price) {
        this.name = name;
        this.style = style;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
