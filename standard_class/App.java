public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 6;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character();

        mage.strength = 7;
        mage.agility = 3;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        Character thief = new Character();

        thief.strength = 2;
        thief.agility = 10;
        thief.intelligence = 8;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character Archer = new Character();

        Archer.strength = 10;
        Archer.agility = 5;
        Archer.intelligence = 10;
        Archer.name = "Ganyu";
        Archer.sayMyName();
        Archer.sayMyStrength();
        Archer.sayMyAgility();
        Archer.sayMyIntelligence();

        Character Tank = new Character();

        Tank.strength = 5;
        Tank.agility = 10;
        Tank.intelligence = 10;
        Tank.name = "Naofumi";
        Tank.sayMyName();
        Tank.sayMyStrength();
        Archer.sayMyAgility();
        Archer.sayMyIntelligence();
    }
}
