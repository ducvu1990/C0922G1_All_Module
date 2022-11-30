package ss19_string_and_regex.bai_tap;

import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String EMAIL_REGEX =
            "^(C|A|P)\\d{4}(G|H|I|K|L|M)$";
    public static boolean validateClassName(String string) {

        return Pattern.matches(EMAIL_REGEX,string);
    }

    public static void main(String[] args) {

        System.out.println(validateClassName("C0318G"));
        System.out.println(validateClassName("M0318G"));
        System.out.println(validateClassName("P0323A"));
    }
}
