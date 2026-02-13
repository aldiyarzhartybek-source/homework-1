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