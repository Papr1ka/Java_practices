package Seventh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        String[] test = new String[]{"F032_Password", "TrySpy1_", "smart_pass", "A007"};
        for (String i: test) {
            if (testRegex(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean testRegex(String s){
        Matcher m = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s);
        return m.find() && m.group().equals(s);
    }
}
