package ex4;

public class Weapon {
    private String type;
    private Integer damage;
    private Integer speed;
    private Integer range;

    public Weapon(String type, Integer damage, Integer speed, Integer range) {
        this.type = type;
        this.damage = damage;
        this.speed = speed;
        this.range = range;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type='" + type + '\'' +
                ", damage=" + damage +
                ", speed=" + speed +
                ", range=" + range +
                '}';
    }
}
