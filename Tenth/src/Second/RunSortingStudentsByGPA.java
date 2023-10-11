package Second;
import First.Student;

import java.util.Arrays;
import java.util.Comparator;

public class RunSortingStudentsByGPA {

    private Student[] iDNumber;

    public void outArray()
    {
        System.out.println(Arrays.toString(this.iDNumber));
    }
    public static void main(String[] args) {
        RunSortingStudentsByGPA r = new RunSortingStudentsByGPA();
        System.out.println("QuickSort, по среднему баллу, по убыванию");
        r.setArray();
        r.quickSortGrades();
        r.outArray();

        System.out.println("MergeSort, по среднему баллу, по убыванию");
        r.setArray();
        r.mergeSortGrades();
        r.outArray();

        System.out.println("QuickSort, по имени, по возрастанию");
        r.setArray();
        r.quickSortNames();
        r.outArray();
    }

    public void setArray()
    {
        this.iDNumber = new Student[]{
                new Student("Кирилл", "Павлов", "Системы поддержки принятия решений", 2, "ИКБО-04-22", new int[]{4, 2, 3}),
                new Student("Яблоков", "Мороз", "Системы поддержки принятия решений", 3, "ИКБО-123-64", new int[]{4, 5, 2}),
                new Student("Апельсинов", "Глеб", "Системы поддержки принятия решений", 4, "ИКБО-123-63", new int[]{4, 4, 3}),
                new Student("Клубничных", "Павел", "Системы поддержки принятия решений", 2, "ИКБО-123-65", new int[]{3, 3, 3}),
                new Student("Томатов", "Иван", "Системы поддержки принятия решений", 1, "ИКБО-123-66", new int[]{5, 5, 5}),
        };
    }

    public void quickSortGrades()
    {
        this.qSort(0, this.iDNumber.length - 1, new ReverseGradesComparator());
    }

    public void mergeSortGrades()
    {
        this.mergeSort(this.iDNumber, new ReverseGradesComparator());
    }

    public void quickSortNames()
    {
        this.qSort(0, this.iDNumber.length - 1, new NameComparator());
    }

    private void qSort(int low, int high, Comparator comp)
    {
        //завершить,если массив пуст или уже нечего делить
        if (iDNumber.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        Student border = iDNumber[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (comp.compare(iDNumber[i], border) < 0) i++;
            while (comp.compare(iDNumber[j], border) > 0) j--;
            if (i <= j) {
                Student swap = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) qSort(low, j, comp);
        if (high > i) qSort(i, high, comp);
    }

    private void merge(Student[] S1, Student[] S2, Student[] S, Comparator<Student> comp) {
        int i = 0, j = 0;
        while (i + j < S.length) {
            if (j == S2.length
                    || (i < S1.length && comp.compare(S1[i], S2[j]) < 0))
                S[i + j] = S1[i++]; // copy ith element of S1 and increment i
            else
                S[i + j] = S2[j++]; // copy jth element of S2 and increment j
        }
    }

    public void mergeSort(Student[] S, Comparator<Student> comp) {
        int n = S.length;
        if (n < 2)
            return; // array is trivially sorted
        // divide
        int mid = n / 2;
        Student[] S1 = Arrays.copyOfRange(S, 0, mid); // copy of first half
        Student[] S2 = Arrays.copyOfRange(S, mid, n); // copy of second half
        // conquer (with recursion)
        mergeSort(S1, comp); // sort copy of first half
        mergeSort(S2, comp); // sort copy of second half
        // merge results
        merge(S1, S2, S, comp); // merge sorted halves back into original
    }
}
