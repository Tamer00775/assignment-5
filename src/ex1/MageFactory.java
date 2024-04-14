package ex1;

public class MageFactory extends CharacterFactory{
    @Override
    public Character createCharacter(String name) {
        Character character = new Character(name);
        character.getAbilities().add("Teleport");
        character.getAppereance().setHeight((Math.random() * 100) + 100);
        character.getAppereance().setWeight((Math.random() * 100) + 10);
        character.getAttributes().put("Intelligence", 12);
        character.getAttributes().put("Mana", 50);

        return character;
    }
}
