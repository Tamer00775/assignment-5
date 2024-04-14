package ex3;

public class FurnitureCreator {
    private FirnitureFactory firnitureFactory;

    public void setFirnitureFactory(FirnitureFactory firnitureFactory) {
        this.firnitureFactory = firnitureFactory;
    }

    public Furniture createChair() {
        return firnitureFactory.createChair();
    }

    public Furniture createTable() {
        return firnitureFactory.createTable();
    }

    public Furniture createSofa() {
        return firnitureFactory.createSofa();
    }
}
