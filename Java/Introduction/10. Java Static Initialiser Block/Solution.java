import java.io.*;
import java.util.*;

import javax.xml.ws.Holder;

public class Solution {

    static boolean inputsPositive;
    static int breadth, height;

    static {

        Scanner scanner = new Scanner(System.in);

        breadth = scanner.nextInt();
        height = scanner.nextInt();

        scanner.close();

        if ((breadth > 0) && (height > 0)) {

            inputsPositive = true;

        } else {
            
            inputsPositive = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }

    }

    public static void main(String[] args) {
        
        int area;

        if (inputsPositive) {
            
            area = breadth * height;
            System.out.println(area);

        }

    }
    
}