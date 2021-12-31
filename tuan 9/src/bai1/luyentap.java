package bai1;

import com.sun.security.jgss.GSSUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class luyentap {
    public static void main(String[] args) {

        String input = "     hellow     abc    xyz   good  night";
        String regex = "[\\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            System.out.println(matcher.replaceAll(" "));
        }


//        String[] fullName = {"Trieu van than", "Nguyen Thi Hoa", "To Trong Phu",
//                "Ngo Van Tai", "Le Duc Anh", "Do Viet Trung", "Tran Thi Ha"};
//        String regex = ".* Th.*";

//        for (int i = 0; i < fullName.length; i++) {
//           matcher = pattern.matcher(fullName[i]);
//           if(matcher.find()){
//               System.out.println(fullName[i]);
//           }
//        }


    }
}
