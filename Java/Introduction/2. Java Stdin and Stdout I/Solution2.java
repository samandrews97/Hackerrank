// Task
// In this challenge, you must read integers from stdin and then print them to stdout. 
// Each integer must be printed on a new line.
// This solution uses bufferedreader instead of scanner.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        try {

            // This only works for multiple integers on the same line.

            // int[] a = Arrays.stream(bufferedReader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();     // Java 8 has the ability to use streams. 

            // for (int i = 0; i < a.length; i++) {

            //     System.out.println(a[i]);

            // }

            
            String input;

            while ((input = bufferedReader.readLine()) != null) {

                Integer.parseInt(input);
                System.out.println(input);

            }

            bufferedReader.close();

        } catch (IOException e) {

            System.err.println("Caught IOException: " + e.getMessage());

        }
        
        
    }

}