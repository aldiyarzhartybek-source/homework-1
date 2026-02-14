package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(" RPG Character & Equipment System \n");


        CharacterCreator warriorCreator = new WarriorCreator();
        CharacterCreator mageCreator = new MageCreator();
        CharacterCreator archerCreator = new ArcherCreator();


        EquipmentFactory medieval = new MedievalEquipmentFactory();
        EquipmentFactory magic = new MagicEquipmentFactory();
        EquipmentFactory ranger = new RangerEquipmentFactory();


        Character warrior = warriorCreator.create("Gats");

        System.out.println("Created Warrior");
        System.out.println(warrior.getStats());

        warrior.equip(medieval.createWeapon(), medieval.createArmor());

        System.out.println("Equipped: " + medieval.getThemeName());
        System.out.println(warrior.getStats());
        System.out.println("----------------------------------------\n");


        Character mage = mageCreator.create("Gendalf");
        System.out.println("[Created Mage");
        System.out.println(mage.getStats());

        mage.equip(magic.createWeapon(), magic.createArmor());

        System.out.println("Equipped: " + magic.getThemeName());
        System.out.println(mage.getStats());
        System.out.println("----------------------------------------\n");


        Character archer = archerCreator.create("Robin Gyd");
        System.out.println("[Created Archer");
        System.out.println(archer.getStats());

        archer.equip(ranger.createWeapon(), ranger.createArmor());

        System.out.println("Equipped: " + ranger.getThemeName());
        System.out.println(archer.getStats());

    }
}