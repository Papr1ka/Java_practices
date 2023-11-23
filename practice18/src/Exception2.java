import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите целое");
        String intString = myScanner.next();
        int i;
        try
        {
            i = Integer.parseInt(intString);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Прошено целое, а не " + intString);
            return;
        }
        try
        {
            System.out.println(2 / i);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Деление на 0 не позволено");
        }
    }
}