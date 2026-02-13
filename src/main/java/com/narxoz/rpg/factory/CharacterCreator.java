package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public abstract class CharacterCreator {


    public Character create(String name) {
        return createCharacter(name); // Factory Method
    }


    protected abstract Character createCharacter(String name);

}
