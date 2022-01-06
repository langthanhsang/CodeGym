package caseStudyModule2.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgeRegex {
    public static final String ageRegex = "^\\d+$";

    public AgeRegex() {
    }
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(ageRegex);
        CharSequence input;
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
