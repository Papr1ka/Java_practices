package Forth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        String prices = "Товар 1 - 25.98 USD, Товар 2 - 123.3 RUB, Товар 3 - 0.98 EU, Товар 4 - 25 USD";
        String regex = "[0-9]*?\\.?[0-9]* (USD|RUB|EU)";
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(prices);
        while (m.find())
        {
            System.out.println(m.group());
        }
    }
}
