package ex4;


public class Main {
    public static void main(String[] args) {
        CharacterCreator characterCreator = new CharacterCreator();
        characterCreator.setCharacterFactory(new WarriorSwordFactory());
        System.out.println(characterCreator.createCharacter());
    }
}
