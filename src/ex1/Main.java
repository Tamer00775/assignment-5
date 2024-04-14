package ex1;

public class Main {
    public static void main(String[] args) {
        CharacterCreator characterCreator = new CharacterCreator();
        characterCreator.setCharacterFactory(new WarriorFactory());
        System.out.println(characterCreator.createCharacter("Warrior"));
        characterCreator.setCharacterFactory(new ArcherFactory());
        System.out.println(characterCreator.createCharacter("Archer"));
        characterCreator.setCharacterFactory(new MageFactory());
        System.out.println(characterCreator.createCharacter("Mage"));
    }
}