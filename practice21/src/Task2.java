import java.util.Arrays;

public class Task2<E> {
    private E[] array;

    public Task2(E[] array) {
        this.array = array;
    }

    public void printArray()
    {
        System.out.println(Arrays.toString(this.array));
    }

    public static void main(String[] args) {
        Integer[] aInt = new Integer[]{1, 2, 3};
        Long[] aLong = new Long[]{(long)4, (long)5, (long)6};

        Task2<Integer> tInt = new Task2<Integer>(aInt);
        Task2<Long> tLong = new Task2<Long>(aLong);

        tInt.printArray();
        tLong.printArray();
    }
}
