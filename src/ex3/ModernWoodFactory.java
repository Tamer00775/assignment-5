package ex3;

public class ModernWoodFactory extends FirnitureFactory {
    @Override
    Furniture createChair() {
        return new Furniture("Modern Wood Chair", "Modern Style", "Modern material", 150.0) ;
    }

    @Override
    Furniture createTable() {
        return new Furniture("Modern Wood Table", "Modern Style", "Modern material", 300.0) ;
    }

    @Override
    Furniture createSofa() {
        return new Furniture("Modern Wood Sofa", "Modern Style", "Modern material", 170.0) ;
    }
}
