package monday;
import java.util.Scanner;

public class FibSeqRecursion {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the first number of the Fibonacci series: ");
	int x = scan.nextInt();
	
	System.out.print("Enter the second number of the Fibonacci series: ");
	int y = scan.nextInt();
	
	System.out.print(x + " " + y + " ");
	printFibSeq(x, y, 2);
	}
	
	public static void printFibSeq(int x, int y, int count) {
	if (count == 15) {
	return;
	}
	int next = x + y;
	System.out.print(next + " ");
	printFibSeq(y, next, count + 1);
	}
}

