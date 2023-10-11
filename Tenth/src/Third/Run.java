package Third;

import First.Student;

import java.util.Arrays;
import java.util.Comparator;
import Second.ReverseGradesComparator;

public class Run {
    public static void main(String[] args) {
        Student[] first = new Student[]{
                new Student("Кирилл", "Павлов", "Системы поддержки принятия решений", 2, "ИКБО-04-22", new int[]{4, 2, 3}),
                new Student("Яблоков", "Мороз", "Системы поддержки принятия решений", 3, "ИКБО-123-64", new int[]{4, 5, 2}),
                new Student("Апельсинов", "Глеб", "Системы поддержки принятия решений", 4, "ИКБО-123-63", new int[]{4, 4, 3}),
                new Student("Клубничных", "Павел", "Системы поддержки принятия решений", 2, "ИКБО-123-65", new int[]{3, 3, 3}),
                new Student("Томатов", "Иван", "Системы поддержки принятия решений", 1, "ИКБО-123-66", new int[]{5, 5, 5}),
        };
        Student[] second = new Student[]{
                new Student("Кирилл", "Павлов", "Системы поддержки принятия решений", 2, "ИКБО-04-22", new int[]{4, 2, 3}),
                new Student("Яблоков", "Мороз", "Системы поддержки принятия решений", 3, "ИКБО-123-64", new int[]{4, 5, 2}),
                new Student("Апельсинов", "Глеб", "Системы поддержки принятия решений", 4, "ИКБО-123-63", new int[]{4, 4, 3}),
                new Student("Клубничных", "Павел", "Системы поддержки принятия решений", 2, "ИКБО-123-65", new int[]{3, 3, 3}),
                new Student("Томатов", "Иван", "Системы поддержки принятия решений", 1, "ИКБО-123-66", new int[]{5, 5, 5}),
        };
        Run r = new Run();
        System.out.println("До:");
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        Comparator<Student> comp = new ReverseGradesComparator();

        r.mergeSort(first, comp);
        r.mergeSort(second,comp);
        Student[] students = new Student[first.length + second.length];
        r.merge(first, second, students, comp);

        System.out.println("После:");
        System.out.println(Arrays.toString(students));
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
