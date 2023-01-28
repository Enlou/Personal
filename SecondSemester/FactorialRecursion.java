import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("Input a number: ");
		int a = scan.nextInt();
		System.out.print("The factorial of " + a + " is: " + factorial(a));
	}
	
	public static int factorial(int a) { // we use "int" to return the resulting factorial number    
	
		if(a == 1) { 
			return 1; 
		} else {
			return a * factorial(a - 1);
		}
	}
}	
