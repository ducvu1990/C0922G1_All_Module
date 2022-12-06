package case_study.utils;

import java.util.regex.Pattern;

public class Validate {
    private static final String SERVICE_CODE = "^SV(VL|RO)-[0-9]{4}";
    private static final String SERVICE_NAME = "[A-Z][a-z]+";
    private static final String USABLE_AREA = "[3-9][0-9]+.[0-9]+";
    private static final String RENTAL_COSTS = "[0-9]+";
    private static final String MAXIMUN_NUMBER_OF_PEOPLE = "^[0-2][0-9]$";
    private static final String NUMBER_OF_FLOORS = "[0-9]+";
    private static final String RENTAL_TYPE = "[A-Z][a-z]+";
    private static final String DATE_OF_BIRTH = "^([0-2][0-9]|3[0-1])/(0[0-9]|1[0-2])/[0-9]{4}$";
    public static boolean validate(String regex, String scenner){
        return Pattern.matches(regex,scenner);
    }
}
