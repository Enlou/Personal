public class Pet {
    // Attributes
    String Name;
    int TrustLevel;
    int PetLevel;
    Boolean IsHappy;
    
    // Method
    public void SayDogName() {
        System.out.println("This Dog is named " + Name);
    }
    
    // Method
    public void SayDogInfo() {
        System.out.println("Our bond level is " + TrustLevel + " and she is level " + PetLevel + ".");
    }

    // Method
    public void SayCatName() {
        System.out.println("This Cat is named " + Name);
    }
   
    // Method
    public void SayCatInfo() {
        System.out.println("Our bond level is " + TrustLevel + " and she is level " + PetLevel + ".");
    }
    
    // Method
    public void SayFoxName() {
        System.out.println("This Fox is Named " + Name);
    }
   
    // Method
    public void SayFoxInfo() {
        System.out.println("Our bond level is " + TrustLevel + " and she is level " + PetLevel + ".");
    }

    // Method
    public void SayMood() { 
        if (IsHappy) {
            System.out.println("She is in good spirit!");
        }   else {
            System.out.println("She is not in the mood.");
        }
    }

    // Constructor
    public Pet(String Tag, int TrLvL, int PLvL, Boolean Mood) {
        Name = Tag;
        TrustLevel = TrLvL;
        PetLevel = PLvL;
        IsHappy = Mood;
}
}
