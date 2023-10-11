package Sixth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        String[] test = new String[]{"user@example.com", "root@localhost", "myhost@@@com.ru", "@my.ru", "Julia String"};
        for (String i: test) {
            if (testRegex(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean testRegex(String s){
        Matcher m = Pattern.compile("([a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\w+@localhost)").matcher(s);
        return m.find() && m.group().equals(s);
    }
}
