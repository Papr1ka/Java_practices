package StringFormatTask;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        double dollars = 100;
        double uanes = 1000;
        System.out.format("У вас %s и %s%n",
                NumberFormat.getCurrencyInstance(Locale.US).format(dollars),
                NumberFormat.getCurrencyInstance(Locale.CHINA).format(uanes));

        Item[] items = {new Item("Полено", 10, 100), new Item("Доска", 12, 120)};
        System.out.println(Arrays.toString(items));
        System.out.println("Выберите номер товара");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        if (index < 0 || index >= items.length)
        {
            System.out.format("Нет такого товара");
        }
        else
        {
            Item item = items[index];
            System.out.println("Выберите валюту, 1 - доллары, 2 - юани");
            int choice = sc.nextInt();
            if (choice != 1 && choice != 2)
            {
                System.out.println("Ошибка, либо 1, либо 2");
            }
            else
            {
                switch (choice)
                {
                    case 1:
                        if (dollars > item.getCostD())
                        {
                            dollars -= item.getCostD();
                        }
                        else
                        {
                            System.out.println("Ошибка, недостаточно средств");
                            return;
                        }
                        break;

                    case 2:
                        if (uanes > item.getCostU())
                        {
                            uanes -= item.getCostU();
                        }
                        else
                        {
                            System.out.println("Ошибка, недостаточно средств");
                            return;
                        }
                        break;

                    // Default case
                    default:
                        System.out.println("что-то не то");
                }
                System.out.println("Поздравляю, вы купили товар");
                System.out.format("У вас %s и %s",
                        NumberFormat.getCurrencyInstance(Locale.US).format(dollars),
                        NumberFormat.getCurrencyInstance(Locale.CHINA).format(uanes));
            }
        }
    }
}
