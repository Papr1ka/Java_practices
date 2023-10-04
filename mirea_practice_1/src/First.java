import java.util.Scanner;

public class First
{
    public static void main(String[] args) {
        int[] arr = new int[5];
        int summa = 0;
        Scanner stdin = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            if (stdin.hasNextInt())
            {
                arr[i] = stdin.nextInt();
                summa += arr[i];
            }
        }

        double avg = (double) summa / 5.0;
        System.out.format("Сумма массива: %d, Среднее массива: %f", summa, avg);
    }
}
