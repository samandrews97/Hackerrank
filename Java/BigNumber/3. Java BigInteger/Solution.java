import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        String aLength = a.toString();
        String bLength = b.toString();

        scanner.close();

        if (((a.compareTo(BigInteger.ZERO) >= 0) && (aLength.length() <= 200)) && ((b.compareTo(BigInteger.ZERO) >= 0) && (bLength.length() <= 200))) {

            BigInteger sum = a.add(b);
            BigInteger product = a.multiply(b);

            System.out.println(sum);
            System.out.println(product);
            
        }

    }

}