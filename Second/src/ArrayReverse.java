import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5", "6", "7"};

        int avg = array.length / 2;
        String tmp;
        int last = array.length - 1;

        for (int i = 0; i < avg; i++)
        {
            tmp = array[i];
            array[i] = array[last - i];
            array[last - i] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}
