package Fifth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        String[] test = new String[]{"29/02/2001", "30/04/2003", "01/01/2003", "01.01.2003", "//2003", "2003/2003/2003", "32/10/2003", "15/13/2004"};
        for (String i: test) {
            if (testRegex(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean testRegex(String s){
        Matcher m = Pattern.compile("([0-2][0-9]|[3][0-1])\\/([0][0-9]|[1][1-2])\\/\\d{4}").matcher(s);
        return m.find() && m.group().equals(s);
    }
}
