package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    private int defense;
    private String armorType;

    public PlateArmor() {
        this.defense = 50;
        this.armorType = "Plate";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Medieval) - Defense: " + defense + ", Type: " + armorType + " (Health Boost)";
    }

    @Override
    public String getArmorType() {
        return armorType;
    }
}
