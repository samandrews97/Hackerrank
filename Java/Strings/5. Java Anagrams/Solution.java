
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String A, String B) {

     

        char[] AUnSorted = A.toLowerCase().toCharArray();
        char[] BUnSorted = B.toLowerCase().toCharArray();
        

        if ((A.length() != B.length()) || (A.length() < 1 || A.length() > 50) || (B.length() < 1 || B.length() > 50)) {

            return false;

        } else {

            java.util.Arrays.sort(AUnSorted);
            String ASorted = new String(AUnSorted);

            java.util.Arrays.sort(BUnSorted);
            String BSorted = new String(BUnSorted);
        

            if (ASorted.equals(BSorted) ) {

                return true;

            } else {

                return false;
            }

        }    

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);

        System.out.println( (ret) ? "Anagrams" : "Not Anagrams");

    }

}