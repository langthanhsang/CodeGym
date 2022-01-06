package caseStudyModule2.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDRegex {
//    public static final String idRegex = "^[H][S] +\\d{6}";
    public static final String idRegex = "^\\d{6}";

    public IDRegex() {
    }
    public static boolean validate(String regx){
        Pattern pattern = Pattern.compile(idRegex);
        Matcher matcher = pattern.matcher(regx);
        return matcher.matches();
    }
}
