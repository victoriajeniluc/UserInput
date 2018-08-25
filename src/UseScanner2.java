/**
 * This class shows how to accept String from user using java.util.Scanner class.
 *
 * @author Udayan Khattry
 */

import java.util.Scanner;

public class UseScanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide your name please!");

        //Accept a series of texts/digits until newline character is found.
        String str = scanner.nextLine();
        scanner.close();

        System.out.println("Hello there " + str);

    }
}
