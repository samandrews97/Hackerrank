import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {

    public static void main(String[] args) {

        // \b - mathces a word boundary
        // [a-z]+ - matches a word with one or more characters
        // (?: - indicates a non-capturing group starts here
        // \s+ - matches one or more whitespace cahracters
        // \1 - back reference to the first captured group, indicatesm word is repeated here
        // )+ - indicates end of non-capturing group and it can occur one or more times

        String regex = "\\b([a-z]+)\\b(?:\\s+\\1\\b)+";

        
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {

            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {

                input = input.replaceAll(m.group(), m.group(1));

            }

            // Print the modified sentence.
            System.out.println(input);

        }

    }

}