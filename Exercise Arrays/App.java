public class Exercise {
    public static void main(String[] args) throws Exception {
  
        int[][] mdArray = {{1, 2, 3, 4}, 
                           {5, 6, 7, 8}, 
                           {9, 10, 11, 12}, 
                           {13, 14, 15 ,16}};
    
  
        // PATTERN 1
        System.out.println("1. SUM OF PATTERN 1");
        int sum = 0;
        for (int CS = 0; CS < mdArray.length; CS++){
            sum += (mdArray[0][CS]);
        }
        System.out.printf("%4s",sum);

        // PATTERN 2
        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2");
        int sum1 = 0;
        for (int RS = 0; RS < mdArray.length; RS++){
            sum1 += (mdArray[RS][0]);
        }        
        System.out.printf("%4s",sum1);

        // PATTERN 3
        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3");
        int sum2 = 0;
        for (int RS = 0; RS < mdArray.length; RS++){
            for (int CS = 0; CS < mdArray.length; CS++){
                if (RS == 0 || CS == 0)
                sum2 += (mdArray[RS][CS]);
            }
        }
        System.out.printf("%4s",sum2);
        
        // PATTERN 4
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4");
        int sum3 = 0;
        for (int RS = 0; RS < mdArray.length; RS++){
            for (int CS = 0; CS < mdArray.length; CS++){
                if ((RS == 0 && CS == 3) || (RS == 3 && CS == 0) || (RS == 3 && CS == 3) || (RS == 0 && CS == 0))
                    sum3 += (mdArray[RS][CS]);
            }
        }

        System.out.printf("%4s",sum3);
        
        // PATTERN 5
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5");
        int sum4 = 0;
        for (int RS = 0; RS < mdArray.length; RS++){
            for (int CS = 0; CS < mdArray.length; CS++){
                if ((RS == 1 && CS == 2) || (RS == 2 && CS == 1) || (RS == 1 && CS == 1) || (RS == 2 && CS == 2))
                    sum4 += (mdArray[RS][CS]);
            }
        }
        System.out.printf("%4s",sum4);

        // PATTERN 6
        System.out.println("");
        System.out.println("6. SUM OF PATTERN 6");

    }
  }
