public class App {
    public static void main(String[] args) {

        // Creates a new object named "Legendary" from Item class
        Item Legendary = new Item(3000, 1, 1, "+120 ability power and +10% cooldown reduction", "Deathfire Grasp", false);
        // Calls the SayItemName method
        Legendary.SayItemName();
        // Calls the SayItemDescription method
        Legendary.SayItemDescription();
        // Calls the SayItemInfo method
        Legendary.SayItemInfo();
        // Calls the SayTrade method
        Legendary.SayTrade();

        // Creates a new object named "Mythic" from Item class
        Item Mythic = new Item(3400, 1, 1, "+60 attack damage, +20% attack speed, and +20% critical strike chance", "Galeforce", false);
        // Calls the SayItemName method
        Mythic.SayItemName();
        // Calls the SayItemDescription method
        Mythic.SayItemDescription();
        // Calls the SayItemInfo method
        Mythic.SayItemInfo();
        // Calls the SayTrade method
        Mythic.SayTrade();
        

        // Creates a new object named "Ornn" from Item class
        Item Ornn = new Item(0, 1, 1, "+80 attack damage, +35% attack speed, and +20% critical strike chance. (This item is only obtainable through Ornn's Upgrade.)", "Typhoon", true);
        // Calls the SayItemName method
        Ornn.SayItemName();
        // Calls the SayItemDescription method
        Ornn.SayItemDescription();
        // Calls the SayItemInfo method
        Ornn.SayItemInfo();
        // Calls the SayTrade method
        Ornn.SayTrade();

        // Creates a new object named "Dog" from Pet Class
        Pet Dog = new Pet("Pringles", 1, 666, true);
        // Calls the SayDogName method
        Dog.SayDogName();
        // Calls the SayDogInfo method
        Dog.SayDogInfo();
        // Calls the SayMood method
        Dog.SayMood();
        
        // Creates a new object Named "Cat" from Pet Class
        Pet Cat = new Pet("Midna", 10, 100, true);
        // Calls the SayCatName method
        Cat.SayCatName();
        // Calls the SayCatInfo method
        Cat.SayCatInfo();
        // Calls the SayMood method
        Cat.SayMood();

        // Creates a new object Named "Fox" from Pet Class
        Pet Fox = new Pet("Ahri", 10, 1000, false);
        // Calls the SayFoxName method
        Fox.SayFoxName();
        // Calls the SayFoxInfo method
        Fox.SayFoxInfo();
        // Calls the SayMood method
        Fox.SayMood();
    }
}
