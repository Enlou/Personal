import java.util.Scanner;
public class thursday {

	static Scanner scan = new Scanner(System.in);

	// Function to check the Vowel
    static int isVowel(char String)
    {
        String = Character.toUpperCase(String);
       if(String =='A' || String =='E' || String =='I' ||
    		   String =='O' || String =='U')
           return 1;
       else return 0;
    }
      
    // Counts the total number of vowel/s in the string
    static int countVowels(String str, int n)
    {
        if (n == 1)
            return isVowel(str.charAt(n - 1));
      
        return countVowels(str, n-1) + isVowel(str.charAt(n - 1));
    }
      
    // Main Calling Function
    public static void main(String args[])
    {
    	System.out.print("Input a String: ");
        // Asks the user to input a String
        String Subject = scan.nextLine();
      
        System.out.print("Number of vowels present in the string: ");
        // Displays the total number of Vowel/s
        System.out.println(countVowels(Subject,Subject.length()));
    }
}

// Reference: https://www.geeksforgeeks.org/program-count-vowels-string-iterative-recursive/
