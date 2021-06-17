import java.lang.*;
import java.util.Scanner;

public class StringManipulation {
    public static String trimAndConcat(String S, String A) {
        String str = S.concat(A);
        return str.trim();

    }

    public static Integer getIndexOrNull(String S, char C) {
        return S.indexOf(C);

    }

    public static Integer getIndexOrNull(String S, String C) {
        return S.indexOf(C);
    }

    public static String concatSubstring(String S, int A, int B, String X) {
        String str = S.substring(A, B);
        return str.concat(X);

    }

    public static void main(String[] args) {
        // Scanner num1 = new Scanner(System.in); // Create a Scanner object
        // System.out.println("Enter num");
        // Scanner str1 = new Scanner(System.in); // Create a Scanner object
        // System.out.println("Enter str");
        String str = "sufian";
        System.out.println(trimAndConcat("ahmad","sufian"));
        System.out.println(getIndexOrNull("ahmad","h"));
        System.out.println(getIndexOrNull("ahmad  sufian",str));
        System.out.println(concatSubstring("ahmad",4,5,"sufian"));

    }
}