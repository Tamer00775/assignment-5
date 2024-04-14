package ex1;

public class ArcherFactory extends CharacterFactory {
    @Override
    Character createCharacter(String name) {
        Character character = new Character(name);
        character.getAppereance().setHeight((Math.random() * 100) + 100);
        character.getAppereance().setWeight((Math.random() * 100) + 10);
        character.getAbilities().add("Shoot");
        character.getAbilities().add("Dodge");
        character.getEquipments().add("Bow");
        character.getEquipments().add("Quiver");
        character.getAttributes().put("Agility", 10);
        character.getAttributes().put("Accuracy", 8);

        return character;
    }
}
