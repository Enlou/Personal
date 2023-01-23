package monday;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stringz {

	    public static void main(String[] args) {
	    	
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a String to replace: ");
	        String Target = input.nextLine(); //Asks the user for the string that they want to modify
	        System.out.print("Enter the replacement string: ");
	        String Substitute = input.nextLine(); //Asks the user what they want to replace the target string
	        String Reborn = "";
	        boolean located = false; 

	        try {
	            File Database = new File("C:/Users/wanawaned/Archive.txt");
	            Scanner fileInput = new Scanner(Database);

	            while (fileInput.hasNextLine()) {
	                String line = fileInput.nextLine();
	                if (line.contains(Target)) {
	                    line = line.replace(Target, Substitute);
	                    located = true; 
	                }
	                Reborn += line + System.lineSeparator();
	            }

	            if (!located) { 
	                System.out.println("<Invalid text>");
	                return;
	            }
	            FileWriter fileWriter = new FileWriter("C:/Users/wanawaned/Archive.txt");
	            fileWriter.write(Reborn);
	            fileWriter.close();

	            System.out.println("New word:");
	            fileInput = new Scanner(Database);
	            while (fileInput.hasNextLine()) {
	                String line = fileInput.nextLine();
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("Error: File not found.");
	        }
	    }
	}
