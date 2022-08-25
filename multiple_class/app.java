public class App {
    public static void main(String[] args) {

        // Character Class
        Character Shield = new Character();

        Shield.strength = 3;
        Shield.agility = 5;
        Shield.intelligence = 10;
        Shield.defense = 10;
        Shield.name = "Naofumi";
        Shield.sayMyName();

        Character Sword = new Character();

        Sword.strength = 10;
        Sword.agility = 8;
        Sword.intelligence = 5;
        Sword.defense = 1;
        Sword.name = "Raphtalia";
        Sword.sayMyName();

        Character Filolial = new Character();

        Filolial.strength = 5;
        Filolial.agility = 10;
        Filolial.intelligence = 1;
        Filolial.defense = 5;
        Filolial.name = "Filo";
        Filolial.sayMyName();

        // Enemy Class
        Enemy Fan = new Enemy();

        Fan.damage = 50;
        Fan.health = 500;
        Fan.armor = 100;
        Fan.hasMagicImmunity = true;
        Fan.name = "Glass";
        Fan.enemyDialogue();

        Enemy Scythe = new Enemy();

        Scythe.damage = 5;
        Scythe.health = 10;
        Scythe.armor = 5;
        Scythe.hasMagicImmunity = false;
        Scythe.name = "L'Arc Berg Sickle";
        Scythe.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();
    }
}
