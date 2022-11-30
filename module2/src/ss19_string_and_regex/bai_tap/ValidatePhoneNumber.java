package ss19_string_and_regex.bai_tap;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String EMAIL_REGEX =
            "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";
    public static boolean validateClassName(String string) {

        return Pattern.matches(EMAIL_REGEX,string);
    }

    public static void main(String[] args) {

        System.out.println(validateClassName("(84)-(0978489648)"));
        System.out.println(validateClassName("(a8)-(22222222)"));
    }
}
