package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://www.w3schools.com/java/java_regex.asp
public class RegularExpressions {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");

        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match Found");
        } else {
            System.out.println("Match not found");
        }
    }

}