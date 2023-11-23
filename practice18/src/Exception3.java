import java.util.Scanner;

public class Exception3 {
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
        catch (Exception e)
        {
            System.out.println("Исключение");
        }
    }
}