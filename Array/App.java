public class App {
    public static void main(String[] args) throws Exception {
        char[]Alias = {'E','N','L','O','U'};
        // System.out.println(MyName[0]);
        // System.out.println(MyName[2]);
        // System.out.println(MyName[4]);
        // System.out.println(MyName[1]);
        // System.out.println(MyName[3]);
        // Individual Print

        // Normal Print / Increment
        for (int i = 0; i < Alias.length; i++){
        if (!(Alias[i] == 'A' || Alias[i] == 'E' || Alias[i] == 'I' || Alias[i] == 'O' || Alias[i] == 'U' )){
        System.out.println(Alias[i]);
            }
        }

        // for (int i = 4; i >= 0; i--){
        // System.out.println(Alias[i]);
        // }
        // Reverse Print / Decrement (can use "name.length - 1" instead of direct value.)

        
    }
}
