package com.narxoz.rpg.equipment;

public class MagicRobes implements Armor {

    private int defense;
    private String armorType;

    public MagicRobes() {
        this.defense = 10;
        this.armorType = "Robes";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Magic Robes (Magic) - Defense: " + defense + ", Type: " + armorType + " (Mana Boost)";
    }

    @Override
    public String getArmorType() {
        return armorType;
    }
}
