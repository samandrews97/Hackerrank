import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {

            String line = in.nextLine();

            // write your code here

            // <(.+)> - Multiple on any character enclosed in < >
            // (([^<>]+)) - Match multple of any character that is not in the set < >
            // </\\1> - / and reference of the first capturing group enclosed in < >
            String regex = "<(.+)>(([^<>]+))</\\1>";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            int matches = 0;

            while (matcher.find()) {

                System.out.println(matcher.group(2));
                matches++;

            }
            if (matches == 0) {

                System.out.println("None");

            }

            testCases--;

        }

        in.close();

    }

}