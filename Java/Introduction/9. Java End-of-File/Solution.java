import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        while (scanner.hasNext()) {

            String currentLine = scanner.nextLine();
            System.out.println(lineNumber + " " + currentLine);

            lineNumber++;

        }
        
        scanner.close();
        
    }
    
}