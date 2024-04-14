package ex1;

public class CharacterCreator {
    private CharacterFactory characterFactory;

    public void setCharacterFactory(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }


    public Character createCharacter(String name) {
        if (characterFactory != null) {
            return characterFactory.createCharacter(name);
        }
        else {
            return null;
        }
    }
}
