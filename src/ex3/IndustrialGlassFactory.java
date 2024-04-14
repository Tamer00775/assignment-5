package ex3;

public class IndustrialGlassFactory extends FirnitureFactory {
    @Override
    Furniture createChair() {
        return new Furniture("IndustrialGlass Chair", "IndustrialGlass Style",
                "IndustrialGlass Material", 160.0);    }

    @Override
    Furniture createTable() {
        return new Furniture("IndustrialGlass Chair", "IndustrialGlass Style",
                "IndustrialGlass Material", 110.0);    }

    @Override
    Furniture createSofa() {
        return new Furniture("IndustrialGlass Chair", "IndustrialGlass Style",
                "IndustrialGlassMaterial", 90.0);    }
}
