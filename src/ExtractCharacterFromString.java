import java.util.Scanner;

public class ExtractCharacterFromString {
    public static void main(String[] args) {
        // How to print out a string by each character by using the user's input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name!");
        String str = scanner.nextLine();
        scanner.close();

       /* if(str.length() != 1) {
            System.out.println("Please only provide one character");
        } else {
            System.out.println(str.charAt(0));
        }*/

        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }


        // how to print out a string using a non-static method
       /* String str = "Vikky";
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }*/
    }
}
