
// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        int sum = add();
        System.out.println("The sum is: " + sum);

        // Method call
        int difference = subtract();
        System.out.println("The difference is: " + difference);

        // Method call
        int age = computeAge();
        System.out.println("Your age is: " + age);

        // Method call
        String crushName = revealMyCrush();
        System.out.println(crushName);

        // Method call
        String Order = GetOrder();
        double Price = GetTotal();
        System.out.println("Your order is " + Order + " and the total price is " + Price);

        // Close scanner
        scan.close();
    }

    static int add() {
        System.out.println("Please enter two numbers to add");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x + y;
    }

    static int subtract() {
        System.out.println("Please enter two numbers to subtract");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x - y;
    }

    static int computeAge() {
        System.out.println("Please enter current year and year of birth");
        System.out.print("Enter current year: ");
        int x = scan.nextInt();

        System.out.print("Enter the year of your birthday: ");
        int y = scan.nextInt();
        return x - y;
    }

    static String revealMyCrush() {
        System.out.println("This will reveal the names of your crushes");
        System.out.print("Enter your name: ");

        String MyName = scan.nextLine();
    
        System.out.print("Enter the name of your crush: ");

        String nameOfMyCrush = scan.nextLine();

        System.out.print("Enter the name of your 2nd crush: ");

        String nameOfMyCrush2 = scan.nextLine();

        return MyName + " loves " + nameOfMyCrush + " and " + nameOfMyCrush2 + " nyehehehe <3";

    }

    static String GetOrder() {
        System.out.println("Welcome to KFC! May i take your order please?");
        System.out.print("Order 1: ");

        String Order1 = scan.nextLine();
    
        System.out.print("Order 2 please?: ");

        String Order2 = scan.nextLine();

        System.out.print("And lastly, Order 3: ");

        String Order3 = scan.nextLine();

        return Order1 + ", " + Order2 + " and, " + Order3;
    }
    
    static double GetTotal() {
        System.out.println("Please enter the respective prices:");
        System.out.print("Price 1: ");
        double x = scan.nextDouble();

        System.out.print("Price 2: ");
        double y = scan.nextDouble();

        System.out.print("Price 3: ");
        double z = scan.nextDouble();

        return (x + y + z);
    }
}
