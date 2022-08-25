public class Enemy {
    // Enemy attributes
    int damage;
    int health;
    int armor;
    boolean hasMagicImmunity;
    String name;

    // Enemy method
    public void enemyDialogue() {
        System.out.println("The Fan Hero, " + name + ", will you be strong enough to save the world that tortured you Tatte no Yuusha? ");
    }

    // Enemy method
    public void enemyDialogue2() {
        System.out.println("Yo kid, the name is " + name + ", so we're really doing this...");
    }

    // Enemy method
    public void enemyDialogue3() {
        System.out.println("I'm " + name + " i do not wish to fight you!");
    }
}
