package monday;
import java.util.Scanner;

public class Jan23 {
    static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Input a number: ");
	    // asks the user for the upper limit of the parameter
		int k = scan.nextInt();
		
	    int result = sum(k);
	    System.out.println("The sum of all the numbers from 1 up to " + k + " is: " + result);
	  }
	  public static int sum(int k) {
		  
		// sets the condition/parameter for when the function will be executed
	    if (k > 0) {
	      
	    	return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	  }
	}

