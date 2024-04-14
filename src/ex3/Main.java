package ex3;

public class Main {
    public static void main(String[] args) {
        FurnitureCreator furnitureCreator = new FurnitureCreator();

        furnitureCreator.setFirnitureFactory(new ModernWoodFactory());
        Furniture modernWoodChair = furnitureCreator.createChair();
        Furniture modernWoodTable = furnitureCreator.createTable();
        Furniture modernWoodSofa = furnitureCreator.createSofa();

        System.out.println("Modern Wood Chair: " + modernWoodChair.getPrice());
        System.out.println("Modern Wood Table: " + modernWoodTable.getPrice());
        System.out.println("Modern Wood Sofa: " + modernWoodSofa.getPrice());

        furnitureCreator.setFirnitureFactory(new TraditionalMetalFactory());
        Furniture traditionalMetalChair = furnitureCreator.createChair();
        Furniture traditionalMetalTable = furnitureCreator.createTable();
        Furniture traditionalMetalSofa = furnitureCreator.createSofa();

        System.out.println("Traditional Metal Chair: " + traditionalMetalChair.getPrice());
        System.out.println("Traditional Metal Table: " + traditionalMetalTable.getPrice());
        System.out.println("Traditional Metal Sofa: " + traditionalMetalSofa.getPrice());

    }
}
