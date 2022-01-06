package caseStudyModule2.Regex;

import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenderRegex {
    public static final String genderRegex = "^[Nn][Aa][Mn] + [Nn][Uu]$";
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(regex);
        CharSequence input;
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
