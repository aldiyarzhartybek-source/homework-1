package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {

    private int defense;
    private String armorType;

    public LeatherArmor() {
        this.defense = 20;
        this.armorType = "Leather";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Ranger) - Defense: " + defense + ", Type: " + armorType + " (Agility Bonus)";
    }

    @Override
    public String getArmorType() {
        return armorType;
    }
}
