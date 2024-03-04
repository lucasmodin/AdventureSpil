public class CharacterFactory {
    public Actor createPlayer(String name, int health, int strength, int dexterity, int intelligence, int wisdom, int charisma) {
        return new Player(name, health, strength, dexterity, intelligence, wisdom, charisma);
    }

    public Actor createNPC (String name, int health, int strength, int dexterity, int intelligence, int wisdom, int charisma) {
        return new NPC(name, health, strength, dexterity, intelligence, wisdom, charisma);
    }


}
