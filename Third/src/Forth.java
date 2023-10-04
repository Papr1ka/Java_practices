import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Forth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true)
        {
            System.out.println("Введите размер массива: ");
            if (sc.hasNextInt())
            {
                n = sc.nextInt();
                break;
            }
        }
        int[] array = new int[n];
        Random rand = new Random();

        int n2 = 0;
        for (int i = 0; i < n; i++)
        {
            array[i] = rand.nextInt(n);
            if (array[i] % 2 == 0)
            {
                n2++;
            }
        }
        System.out.println("Массив:");
        System.out.println(Arrays.toString(array));

        if (n2 > 0)
        {
            int[] array2 = new int[n2];
            int index = 0;
            for (int i = 0; i < n; i++)
            {
                if (array[i] % 2 == 0)
                {
                    array2[index] = array[i];
                    index++;
                }
            }

            System.out.println("Массив из чётных чисел:");
            System.out.println(Arrays.toString(array2));
        }
        else
        {
            System.out.println("Чётных чисел нет");
        }
    }
}
