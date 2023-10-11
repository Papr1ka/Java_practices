package Forth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("<yyyy><MM><dd><HH><mm>");
        System.out.println(fmt.parse("<2023><10><11><10><28>"));
        System.out.println("Введите временную отметку в формате:\n<yyyy><MM><dd>\n<HH><mm>");
        Scanner in = new Scanner(System.in);
        String stringDate = in.next();
        String stringTime= in.next();
        stringDate += stringTime;
        Date date = fmt.parse(stringDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        System.out.println(date);
        System.out.println(cal);
    }
}
