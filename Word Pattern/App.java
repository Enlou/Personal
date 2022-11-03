import javax.lang.model.util.ElementScanner6;

public class App {
    public static void main(String[] args) throws Exception {
  
        char[][] mdArray = {{'S', 'L', 'A', 'M'}, 
                           {'T', 'I', 'L', 'E'}, 
                           {'E', 'A', 'T', 'S'}, 
                           {'P', 'R', 'O', 'S'}};
    
  
        // PATTERN 
    System.out.println("");
    System.out.println("Word 1");
        for (int row = 0; row < 4; row++) {
            // System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 0) {
                    System.out.print(mdArray[row][column]);
            }
        }
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Word 2");
        for (int row = 0; row < 4; row++) {
            // System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 1) {
                    System.out.print(mdArray[row][column]);
            }
        }
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Word 3");
        for (int row = 0; row < 4; row++) {
            // System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 2) {
                    System.out.print(mdArray[row][column]);
            }
        }
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Word 4");
        for (int row = 0; row < 4; row++) {
            // System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 3) {
                    System.out.print(mdArray[row][column]);
            }
        }
    }

    System.out.println("");
    System.out.println("");
    System.out.println("Word 5");
        for (int row = 0; row < 4; row++) {
            // System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 0) {
                    System.out.println(mdArray[row][column]);
            }
        }
    }

    System.out.println("");
    System.out.println("Word 6");
        for (int row = 0; row < 4; row++) {
            // System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 1) {
                    System.out.println(mdArray[row][column]);
            }
        }
    }

    System.out.println("");
    System.out.println("Word 7");
        for (int row = 0; row < 4; row++) {
            // System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 3) {
                    System.out.println(mdArray[row][column]);
            }
        }
    }

    System.out.println("");
    System.out.println("Word 8");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == row){
                    System.out.print(mdArray[row][column]);
            }
            else 
            {
                System.out.print(" ");
            }
        }
    }

    System.out.println(" ");
    System.out.println("");
    System.out.println("Word 9");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if ((column == 0 && row == 3 || column == 1 && row == 2 || column == 2 && row == 1 || column == 3 && row == 0)) {
                    System.out.print(mdArray[row][column]);
            }
            else
            {
                System.out.print(" ");
            }
        }
    }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Word 10");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if ((column == 0 && row == 3 || column == 1 && row == 2 || column == 2 && row == 1 || column == 3 && row == 0)) {
                    System.out.print(mdArray[row][column]);
            }
            else
            {
                System.out.print(" ");
            }
        }
    }

  }
}
