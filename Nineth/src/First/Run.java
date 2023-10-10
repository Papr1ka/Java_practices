package First;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Student[] iDNumber = new Student[]{
                new Student(10),
                new Student(1),
                new Student(8),
                new Student(-10),
                new Student(100),
                new Student(1000),
                new Student(3),
                new Student(2),
        };
        Run r = new Run();
        System.out.println("До:");
        System.out.println(Arrays.toString(iDNumber));
        r.insertionSort(iDNumber);
        System.out.println("После:");
        System.out.println(Arrays.toString(iDNumber));
    }

    public void insertionSort(Comparable[] iDNumber)
    {
        for (int left = 0; left < iDNumber.length; left++) {
            // Вытаскиваем значение элемента
            Comparable value = iDNumber[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.compareTo(iDNumber[i]) < 0) {
                    iDNumber[i + 1] = iDNumber[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            iDNumber[i + 1] = value;
        }
    }
}
