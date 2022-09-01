public class Item {
    // Attributes
    int Price;
    int Weight;
    int Quantity;
    String Description;
    String Name;
    Boolean CanBeTraded;

    // Method
    public void SayItemName() {
        System.out.println("This item is called " + Name);
    }
    
    // Method
    public void SayItemDescription() {
        System.out.println("This item cost " + Price + " gold for " + Quantity + " piece and weighs for " + Weight + " item slot.");
    }

    // Method
    public void SayItemInfo() {
        System.out.println("This item gives you " + Description);
    }

    // Method
    public void SayTrade() { 
    if (CanBeTraded) {
        System.out.println("it is tradeable.");
    }   else {
        System.out.println("it is not available for trade.");
    }

}

    // Constructor
    public Item(int Prc, int Wgt, int Qty, String Desc, String Tag, Boolean Tradeable) {
        Price = Prc;
        Weight = Wgt;
        Quantity = Qty;
        Description = Desc;
        Name = Tag;
        CanBeTraded = Tradeable;
}
}
