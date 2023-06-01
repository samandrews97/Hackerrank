import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {

            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

        in.close();

    }

}

class MyRegex {

    // [01]?\\d{1,2} numbers 0-199
    // 2[0-4]\\d numbers 200-249
    // 25[0-5] numbers 250-255

    String number = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = number + "." + number + "." + number + "." + number;


}