package ex3;

public class TraditionalMetalFactory extends FirnitureFactory{
    @Override
    Furniture createChair() {
        return new Furniture("Traditional Metal Chair", "Traditional Metal Style",
                "Traditional Metal Material", 120.0);
    }

    @Override
    Furniture createTable() {
        return new Furniture("Traditional Metal Table", "Traditional Metal Style",
                "Traditional Metal Material", 170.0);
    }

    @Override
    Furniture createSofa() {
        return new Furniture("Traditional Metal Sofa", "Traditional Metal Style",
                "Traditional Metal Material", 100.0);
    }
}
