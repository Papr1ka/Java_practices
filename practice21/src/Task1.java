import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1<E> {
    public static void main(String[] args) {
        Task1<Integer> t = new Task1<Integer>();
        Integer[] numbers = {1, 2, 3};
        ArrayList<Integer> alst = t.convert(numbers);

        Task1<String> t2 = new Task1<String>();
        String[] strings = {"Первый", "Второй"};
        ArrayList<String> slst = t2.convert(strings);

        System.out.println(alst);
        System.out.println(slst);
    }

    public ArrayList<E> convert(E[] lst)
    {
        ArrayList<E> alst = new ArrayList<E>();
        Collections.addAll(alst, lst);
        return alst;
    }
}
