public class App {
    public static void main(String[] args) throws Exception {
            // Individual Print
        // char[]Alias = {'E','N','L','O','U'};
        // System.out.println(MyName[0]);
        // System.out.println(MyName[2]);
        // System.out.println(MyName[4]);
        // System.out.println(MyName[1]);
        // System.out.println(MyName[3]);

            // Normal Print / Increment
        // for (int i = 0; i < Alias.length; i++){
            // Array with IF condition
        // if (!(Alias[i] == 'A' || Alias[i] == 'E' || Alias[i] == 'I' || Alias[i] == 'O' || Alias[i] == 'U' )){
        // System.out.println(Alias[i]);
        //     }
        // }

            // Reverse Print / Decrement (can use "name.length - 1" instead of direct value.)
        // for (int i = 4; i >= 0; i--){
        // System.out.println(Alias[i]);
        // }

            // Multidimensional Array Normal Print / Increment
        // char[][]Seats = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
        // for (int i = 0; i < Seats.length; i++){
        // System.out.println(Seats[i]);
        // }

            // Multidimensional Array Individual Print
        // char[][]Seats = {{'A','B','C'},
        //                  {'D','E','F'},
        //                  {'G','H','I'},
        //                  {'J','K','L'},
        //                  {'M','N','O'},
        //                  {'P','Q','R'},
        //                  {'S','T','U'},
        //                  {'V','W','X'},
        //                  {'Y','Z','0'}};
        // System.out.print(Seats[3][0]);
        // System.out.print(Seats[0][0]);
        // System.out.print(Seats[6][0]);
        // System.out.print(Seats[6][0]);
        // System.out.print(Seats[2][2]);
        // System.out.print(Seats[4][0]);
        // System.out.print(Seats[0][0]);
        // System.out.print(Seats[1][1]);

            // Nested Loop (For Loop)
        // for (int hours = 0; hours < 12; hours++){
        //     for (int minutes = 0; minutes < 60; minutes++){
        //         for (int seconds = 0; seconds < 60; seconds++){
        //         System.out.println(hours + " : " + minutes + " : " + seconds);
        //         }
        //     }
        // }

            // Nested Loop with breaklines. Increment (Empty print callouts in Outer Loop serves as Break Lines.) 
        // char[][]Seats = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
        // for (int RS = 0; RS < 3; RS++){
        //     System.out.println("");
        //     for (int CS = 0; CS < 3; CS++){
        //         System.out.print(Seats[RS][CS]);
        //     }
        // }

            // Nested Loop with breaklines. Decrement
        // char[][]Seats = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
        // for (int RS = Seats.length - 1; RS >= 0; RS--){
        //     System.out.println("");
        //     for (int CS = Seats.length - 1; CS >= 0; CS--){
        //         System.out.print(Seats[RS][CS]);
        //     }
        // }

            // Pattern Loop
        char[][]Seats = {{'A','B','C'},
                         {'D','E','F'},
                         {'G','H','I'},
                         {'J','K','L'},
                         {'M','N','O'},
                         {'P','Q','R'}};
        for (int RS = 0; RS < Seats.length; RS++){
            System.out.println("");
            for (int CS = 0; CS < Seats[RS].length; CS++){
                if(RS % 2 == 0 && CS % 2 == 0){
                    System.out.print(Seats[RS][CS]);
                } else if (RS % 2 == 1 && (CS % 2 == 1)){
                    System.out.print(Seats[RS][CS]);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}

