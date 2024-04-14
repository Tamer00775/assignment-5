package ex1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Character {
    private String name;
    private List<String> abilities;
    private List<String> equipments;
    private Appereance appereance;
    private Map<String, Object> attributes;

    public Character(String name) {
        this.name = name;
        this.abilities = new ArrayList<>();
        this.equipments = new ArrayList<>();
        this.appereance = new Appereance();
        this.attributes = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public List<String> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<String> equipments) {
        this.equipments = equipments;
    }

    public Appereance getAppereance() {
        return appereance;
    }

    public void setAppereance(Appereance appereance) {
        this.appereance = appereance;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", abilities=" + abilities +
                ", equipments=" + equipments +
                ", appereance=" + appereance +
                ", attributes=" + attributes +
                '}';
    }
}
