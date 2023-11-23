import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fio = sc.nextLine();
        String inn = sc.nextLine();
        try {
            long i = Task1.getInn(inn);
            System.out.println("Данные верны");
        }
        catch (InvalidInnException e)
        {
            System.out.println("Проблемы с ИНН");
        }

    }

    public static long getInn(String inn)
    {
        boolean r = Pattern.compile("\\d{10}(\\d{2})?").matcher(inn).matches();
        if (r != true)
        {
            throw new InvalidInnException("Невалидный ИНН");
        }
        return Long.parseLong(inn);
    }
}
