import java.util.Scanner;

public class TestShop {
    public void test()
    {
        System.out.format("%-10s %-15s %10s\n", "-----", "TestShop", "-----");

        Shop shop = new Shop();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Введите Название и цену компьютера через разделительный символ");
            System.out.println("Введите только число для завершения ввода");
            if (sc.hasNextInt())
            {
                sc.nextInt();
                break;
            }
            Computer comp = new Computer();
            if (sc.hasNext())
            {
                comp.setName(sc.next());
            }
            else
            {
                System.out.println("Ошибка, отсутствует имя, ввод завершён");
                break;
            }
            if (sc.hasNextInt())
            {
                comp.setPrice(sc.nextInt());
            }
            else
            {
                System.out.println("Ошибка, отсутствует цена, ввод завершён");
                break;
            }
            shop.addComputer(comp);
        }
        System.out.println("Ассортимент:");
        System.out.println(shop);

        while (true)
        {
            System.out.println("Введите команду find | add | remove");
            System.out.println("Введите число для завершения ввода");
            if (sc.hasNextInt())
            {
                break;
            }
            if (sc.hasNext())
            {
                String command = sc.next();
                switch (command)
                {
                    case "find":
                        System.out.println("Введите имя компьютера:");
                        if (sc.hasNext())
                        {
                            int index = shop.getComputerIndex(sc.next());
                            if (index != -1)
                            {
                                System.out.println(

                                        shop.getComputer(index)
                                );
                            }
                            else
                            {
                                System.out.println("Компьютер не найден");
                            }
                        }
                        else
                        {
                            System.out.println("Ошибка, ввод завершён");
                            return;
                        }
                        break;
                    case "add":
                        System.out.println("Введите Название и цену компьютера через разделительный символ");
                        Computer comp = new Computer();
                        if (sc.hasNext())
                        {
                            comp.setName(sc.next());
                        }
                        else
                        {
                            System.out.println("Ошибка, отсутствует имя, ввод завершён");
                            return;
                        }
                        if (sc.hasNextInt())
                        {
                            comp.setPrice(sc.nextInt());
                        }
                        else
                        {
                            System.out.println("Ошибка, отсутствует цена, ввод завершён");
                            return;
                        }
                        shop.addComputer(comp);
                        System.out.println("Компьютер добавлен");
                        break;
                    case "remove":
                        System.out.println("Введите имя компьютера:");
                        if (sc.hasNext())
                        {
                            int index = shop.getComputerIndex(sc.next());
                            if (index != -1)
                            {
                                shop.removeComputer(index);
                                System.out.println("Компьютер удалён");
                            }
                            else
                            {
                                System.out.println("Компьютер не найден");
                            }
                        }
                        else
                        {
                            System.out.println("Ошибка, ввод завершён");
                            return;
                        }
                        break;
                }
            }
        }

        System.out.format("%-10s %-15s %10s\n", "-----", "End TestShop", "-----");
    }
}
