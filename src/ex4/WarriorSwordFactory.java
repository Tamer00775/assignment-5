package ex4;

public class WarriorSwordFactory extends CharacterFactory{
    @Override
    public ConcreteCharacter createCharacter() {
        ConcreteWeapon concreteWeapon = createWeapon();
        return new ConcreteCharacter("Warrior", "Warrior", concreteWeapon, 30, 30);
    }

    @Override
    public ConcreteWeapon createWeapon() {
        return new ConcreteWeapon("Sword", 10, 10, 2);
    }
}
