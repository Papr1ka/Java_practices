package StringFormatTask;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        double amount;
        double dollars, uanes;

        Scanner sc = new Scanner(System.in);

        System.out.println("Какую валюту будете конвертировать?");
        System.out.println("1: Доллары");
        System.out.println("2: Юани");

        int choice = sc.nextInt();

        System.out.println("Сколько?");
        amount = sc.nextDouble();

        switch (choice)
        {
            case 1:
                uanes = amount / 0.14;
                System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(uanes));
                break;

            case 2:
                dollars = amount * 0.14;
                System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(dollars));
                break;

            // Default case
            default:
                System.out.println("что-то не то");
        }
    }
}
