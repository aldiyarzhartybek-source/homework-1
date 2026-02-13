package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.*;

public class RangerEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new Crossbow();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }

    @Override
    public String getThemeName() {
        return "Ranger";
    }
}
