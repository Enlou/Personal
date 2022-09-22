
// import the Scanner class
import java.util.Scanner;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Spinach Pizza that costs 400.00 pesos");
        System.out.println("Enter B if you want a Four Cheese Pizza that costs 300.00 pesos");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);
        System.out.print("How many do you want?: ");
        int quantity = scan.nextInt();

        String pizza = "";
        double price = 0;

        switch (choice) {
            case 'A':
                pizza = "Creamy Spinach Pizza";
                price = 400.00;
                break;
            case 'B':
                pizza = "Four Cheese Pizza";
                price = 300.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }
    
        System.out.println("Please choose your preferred type of crust:");
        System.out.println("Enter A if you want a Thin Crust");
        System.out.println("Enter B if you want a Thick Crust");

        System.out.print("Enter your choice here: ");
        char choice2 = scan.next().charAt(0);
    
        String crust = "";

        switch (choice2) {
            case 'A':
                crust = "Thin Crust";
                break;
            case 'B':
                crust = "Thick Crust";
                break;
            default:
                System.out.println("Invalid Type");
                return;
        }

        System.out.println("Please choose your pizzize (pizza size):");
        System.out.println("Enter A if you want a Small Size");
        System.out.println("Enter B if you want a Medium Size");
        System.out.println("Enter C if you want a Large Size");

        System.out.print("Enter your choice here: ");
        char choice3 = scan.next().charAt(0);
    
        String size = "";

        switch (choice3) {
            case 'A':
                size = "Small";
                break;
            case 'B':
                size = "Medium";
                break;
            case 'C':
                size = "Large";
                break;
            default:
                System.out.println("Invalid Type");
                return;
        }

        System.out.println("Your order is: " + quantity + " " + size + " " + pizza + " with a " + crust);
        System.out.println("Your total amount is: " + (price * quantity));


        scan.close();
    }
}
