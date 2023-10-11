package Second;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате dd-MM-yyyy");
        String stringDate = in.next();
        Date cal;
        try {
            cal = formatter.parse(stringDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        long current = System.currentTimeMillis() / 1000 / 60 / 60 / 24;
        Date now = new Date(current * 24 * 60 * 60 * 1000 - 1000 * 60 * 60 * 3);
        if (now.compareTo(cal) < 0)
        {
            System.out.println("Введённое время больше текущего");
        }
        else if (now.compareTo(cal) > 0)
        {
            System.out.println("Введённое время меньше текущего");
        }
        else
        {
            System.out.println("Введённое время равно текущему");
        }
    }
}
