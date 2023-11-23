import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите целое");
        String intString = myScanner.next();
        int i;
        try
        {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Прошено целое, а не " + intString);
            return;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Деление на 0 не позволено");
        }
        finally
        {
            System.out.println("Блок finally");
        }
    }
}