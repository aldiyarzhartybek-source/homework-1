package com.narxoz.rpg.equipment;

public class Crossbow implements Weapon {

    private int damage;
    private String weaponType;

    public Crossbow() {
        this.damage = 32;      // чуть сильнее лука
        this.weaponType = "Crossbow";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Crossbow (Ranger) - Damage: " + damage + ", Type: " + weaponType + " (High precision)";
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }
}
