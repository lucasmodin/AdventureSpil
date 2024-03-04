public class Player extends Actor {

    public Player(String name, int health, int strength, int dexterity, int intelligence, int wisdom, int charisma) {
        super(name, health, strength, dexterity, intelligence, wisdom, charisma);
    }

public boolean performPerceptionCheck() {
        int perceptionModifier = calculateWisdomModifier();
        int diceRoll = rollD20();
        int perceptionCheckResult = diceRoll + perceptionModifier;

            return perceptionCheckResult >= 12;
        }
}







}
