package stringOperations;

// https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
public class BasicOperations {

    public static void main(String[] arg) {
        showDelete();
        showAppend();
        showReplace();
        showReverse();
    }

    // https://www.geeksforgeeks.org/stringbuilder-delete-in-java-with-examples/
    private static void showDelete() {
        String input = "test";
        // initialize string builder with string so it can manipulate it
        StringBuilder str = new StringBuilder(input);
        // parameters are start index and ending index
        str.delete(0, 2);
        System.out.println("Remaining characters in string is now st: " + str.toString());
    }

    // https://www.geeksforgeeks.org/stringbuilder-append-method-in-java-with-examples/
    private static void showAppend() {
        String input = "test";
        // initialize string builder with string so it can manipulate it
        StringBuilder str = new StringBuilder(input);
        str.append(" now!");
        System.out.println("Appended new string is now test now!: " + str.toString());
    }

    // https://www.geeksforgeeks.org/stringbuilder-replace-in-java-with-examples/
    public static void showReplace() {
        String input = "test";
        StringBuilder str = new StringBuilder(input);
        str.replace(0, 2, "re");
        System.out.println("Replaced string is now rest: " + str.toString());
    }

    // https://www.geeksforgeeks.org/stringbuilder-reverse-in-java-with-examples/
    public static void showReverse() {
        String input = "test";
        StringBuilder str = new StringBuilder(input);
        str.reverse();
        System.out.println("reversed text is now tset: " + str.toString());
    }

}
