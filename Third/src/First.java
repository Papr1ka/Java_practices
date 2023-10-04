import java.util.Arrays;
import java.util.Random;

public class First {
    public static void main(String[] args) {
        double[] array = new double[10];
        Random rand = new Random();
        System.out.println("Реализация через класс Random");
        for (int i = 0; i < 10; i++)
        {
            array[i] = rand.nextDouble();
        }

        System.out.println("Массив до:");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Arrays.sort(array);

        System.out.println("Массив после:");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Реализация через метод Math.random");
        for (int i = 0; i < 10; i++)
        {
            array[i] = Math.random();
        }

        System.out.println("Массив до:");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Arrays.sort(array);

        System.out.println("Массив после:");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
