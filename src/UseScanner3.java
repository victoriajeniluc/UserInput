/**
 * This class shows the problem of using nextLine() method after other next methods.
 * It also shows how to resolve this problem.
 *
 * @author Udayan Khattry
 */

import java.util.Scanner;

public class UseScanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter a sentence: ");

        // in order to be able to move he cursor after the \n (solving the issue from the code below on line 25... you would just have to do this:
        scanner.nextLine();

        //Below statement is to consume newline character (\n) left by previous nextInt() method.
        String str = scanner.nextLine();

        scanner.close();

        System.out.println("OUTPUT: " + num1 + num2 + ":" + str + ":");
    }
}
