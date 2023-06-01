import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // month -1 as month index begins at 0
        
        Map<Integer, String> daysOfTheWeek = new HashMap<>();
        daysOfTheWeek.put(1, "SUNDAY");
        daysOfTheWeek.put(2, "MONDAY");
        daysOfTheWeek.put(3, "TUESDAY");
        daysOfTheWeek.put(4, "WEDNESDAY");
        daysOfTheWeek.put(5, "THURSDAY");
        daysOfTheWeek.put(6, "FRIDAY");
        daysOfTheWeek.put(7, "SATURDAY");

        return daysOfTheWeek.get(calendar.get(Calendar.DAY_OF_WEEK));

    }

}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }

}