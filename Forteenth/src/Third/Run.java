package Third;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        String[] test = new String[]{"(1 + 8) – 9 / 4", "6 / 5 – 2 * 9", "1 + 3 - 5"};
        for (String i: test) {
            if (testRegex(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean testRegex(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }
}
