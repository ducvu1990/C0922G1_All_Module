package case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Validate {
    private static final String SERVICE_CODE = "^SV(VL|RO)-[0-9]{4}";
    private static final String SERVICE_NAME = "[A-Z][a-z]+";
    private static final String USABLE_AREA = "[3-9][0-9]+.[0-9]+";
    private static final String RENTAL_COSTS = "[0-9]+";
    private static final String MAXIMUN_NUMBER_OF_PEOPLE = "^[0-2][0-9]$";
    private static final String NUMBER_OF_FLOORS = "[0-9]+";
    private static final String RENTAL_TYPE = "[A-Z][a-z]+";
    private static final String DATE_OF_BIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?" +
            "(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])" +
            "(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static boolean validate(String regex, String scenner){
        return Pattern.matches(regex,scenner);
    }
    public static boolean regexAge(String regex, String scenner){
        if (Pattern.matches(regex, scenner)){
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateOfBirth = LocalDate.parse(scenner,dateTimeFormatter);
            LocalDate now = LocalDate.now();
            int age = Period.between(dateOfBirth, now).getYears();
            if (age<100 && age>18){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
