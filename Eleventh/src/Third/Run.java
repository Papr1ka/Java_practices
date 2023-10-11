package Third;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Run {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat fmt1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat fmt2 = new SimpleDateFormat("yyyy-MM-dd");
        Student s1 = new Student("Кирилл", "Павлов", "Системы поддержки принятия решений", 2,
                "ИКБО-04-22", new int[]{4, 2, 3}, fmt1.parse("27-10-2004"), fmt1);
        Student s2 = new Student("Кирилл", "Павлов", "Системы поддержки принятия решений", 2,
                "ИКБО-04-22", new int[]{4, 2, 3}, fmt1.parse("27-10-2004"), fmt2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
