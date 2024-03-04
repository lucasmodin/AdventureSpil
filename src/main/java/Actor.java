import java.util.Random;

public class Actor {
    private String name;
    private int health;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Actor (String name, int health, int strength, int dexterity, int intelligence, int wisdom, int charisma) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }



    //***** SKILL AND ROLL METHODS FOR SUBCLASSES ****\\

    //roll method and skill modifiers so the subclasses Player & NPC can inherit the methods instead of making the methods in each class
    public int rollD20() {
        Random dice = new Random();
        return dice.nextInt(20)+1; // 1 to 20
    }

    public int calculateStrengthModifier(){
        return getAttributeBonus(strength, 16, 2);
    }

    public int calculateDexterityModifier(){
        return getAttributeBonus(dexterity, 16, 2);
    }

    public int calculateIntelligenceModifier(){
        return getAttributeBonus(intelligence, 16, 2);
    }

    public int calculateWisdomModifier() {
        return getAttributeBonus(wisdom, 16, 2);
    }

    public int calculateCharismaModifier(){
        return getAttributeBonus(charisma, 16, 2);
    }


    public int getAttributeBonus(int attributeValue, int threshold, int bonus) {
         if (attributeValue > threshold) {
             return bonus;
         } else {
             return 0;
         }
    }


}
