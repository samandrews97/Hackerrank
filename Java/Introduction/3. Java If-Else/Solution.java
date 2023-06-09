//Task
// Given an integer, n, perform the following conditional actions:
// 1. If n is odd, print Weird
// 2. If n is even and in the inclusive range of 2 to 5, print Not Weird
// 3. If n is even and in the inclusive range of 6 to 20, print Weird
// 4. If n is even and greater than 20, print Not Weird
// Print Weird if the number is weird; otherwise, print Not Weird.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 != 0) {

            System.out.println("Weird");

        } else if ((N % 2 == 0) && (N >= 2 && N <= 5)) {

            System.out.println("Not Weird");

        } else if ((N % 2 == 0) && (N >= 6 && N <= 20)) {

            System.out.println("Weird");

        } else if ((N % 2 == 0) && (N > 20)) {

            System.out.println("Not Weird");

        } else {

            System.out.println("Not Weird.");

        }

        scanner.close();

    }

}