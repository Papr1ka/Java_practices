package Second;

import First.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Run {
    public static void main(String[] args) {
        Student[] iDNumber = new Student[]{
                new Student(new int[]{3, 3, 3}),
                new Student(new int[]{4, 5, 3}),
                new Student(new int[]{4, 4, 5}),
                new Student(new int[]{5, 5, 5}),
                new Student(new int[]{5, 5, 4}),
                new Student(new int[]{3, 3, 4}),
        };
        Run r = new Run();
        System.out.println("До:");
        System.out.println(Arrays.toString(iDNumber));
        r.quickSort(iDNumber, 0, iDNumber.length - 1);
        System.out.println("После:");
        System.out.println(Arrays.toString(iDNumber));
    }

    public void quickSort(Comparator[] array, int low, int high)
    {
        //завершить,если массив пуст или уже нечего делить
        if (array.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        Comparator border = array[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (array[i].compare(array[i], border) < 0) i++;
            while (array[j].compare(array[j], border) > 0) j--;
            if (i <= j) {
                Comparator swap = array[i];
                array[i] = array[j];
                array[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(array, low, j);
        if (high > i) quickSort(array, i, high);
    }
}
