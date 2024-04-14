package ex4;

public class CharacterCreator {
    private CharacterFactory characterFactory;

    public void setCharacterFactory(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    public ConcreteCharacter createCharacter() {
        if (characterFactory == null) {
            return null;
        }
        return characterFactory.createCharacter();
    }
}
