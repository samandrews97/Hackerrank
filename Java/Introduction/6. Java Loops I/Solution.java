// Task
// Given an integer, N, print its first multiples. 
// Each multiple N x i(where 1 <= i <= 10) 
// should be printed on a new line in the 
// form: N x i = result.
import java.io.IOException;
import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(BufferedReader.readLine().trim());

        int total = 0;

        for (int i = 1; i <= 10; i++) {

            total = N * i;

            System.out.println(N + " x " + i + " = " + total);

        }

        BufferedReader.close();

    }
    
}