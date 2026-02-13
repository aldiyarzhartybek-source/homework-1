package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public interface Character {
    String getName();

    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();

    void equip(Weapon weapon, Armor armor);

    String getStats();
    String useSpecialAbility();
}
