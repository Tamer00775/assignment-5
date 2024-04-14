package ex4;

public class Character {
    private String name;
    private String clazz;
    private Integer health;
    private Integer mana;

    private Weapon weapon;

    public Character(String name, String clazz, Integer health, Integer mana, Weapon weapon) {
        this.name = name;
        this.clazz = clazz;
        this.health = health;
        this.mana = mana;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                '}';
    }
}
