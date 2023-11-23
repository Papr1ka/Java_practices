import java.util.Arrays;

public class Task3<E> {
    private E[] array;

    public Task3(E[] array) {
        this.array = array;
    }

    public void printArray()
    {
        System.out.println(Arrays.toString(this.array));
    }

    public E getElem(int index)
    {
        return this.array[index];
    }

    public static void main(String[] args) {
        Integer[] aInt = new Integer[]{1, 2, 3};
        Long[] aLong = new Long[]{(long)4, (long)5, (long)6};

        Task3<Integer> tInt = new Task3<Integer>(aInt);
        Task3<Long> tLong = new Task3<Long>(aLong);

        System.out.println(tInt.getElem(0));
        System.out.println(tLong.getElem(1));
    }
}
