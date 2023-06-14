import java.util.Scanner;

class UsernameValidator {

    /*
     * Write regular expression here.
     */

    // ^ - The beginning of a line
    // [a-zA-Z] - All letters a-z and A-Z. In this expression only applies to the first character
    // [a-zA-Z0-9_] - All letters a-z and A-Z. All numbers 0-9 and _. 
    // {7,29} - Applies the expression across the range of 7 to 29 cahracters.
    // $ - The end of a line.

    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

}

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scan.nextLine());

        while (n-- != 0) {

            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {

                System.out.println("Valid");

            } else {

                System.out.println("Invalid");

            }

        }

    }

}