package ex1;

public class WarriorFactory extends CharacterFactory{
    @Override
    Character createCharacter(String name) {
        Character character = new Character(name);
        character.getAppereance().setHeight((Math.random() * 100) + 100);
        character.getAppereance().setWeight((Math.random() * 100) + 10);
        character.getAbilities().add("Slash");
        character.getAbilities().add("Block");
        character.getEquipments().add("Sword");
        character.getEquipments().add("Shield");
        character.getAttributes().put("Strength", 10);
        character.getAttributes().put("Defense", 8);

        return character;
    }
}
