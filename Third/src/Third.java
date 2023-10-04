import java.util.Arrays;
import java.util.Random;

public class Third {
    public static void main(String[] args) {
        int size = 4;
        int[] array = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++)
        {
            array[i] = rand.nextInt();
        }

        System.out.println(Arrays.toString(array));

        int buffer = array[0];

        for (int i = 1; i < size; i++)
        {
            if (array[i] <= buffer)
            {
                System.out.println("Последовательность не строго возрастает");
                return;
            }
            buffer = array[i];
        }
        System.out.println("Последовательность строго возрастает");
    }
}
