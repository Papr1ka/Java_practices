package Third;

import First.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Run {
    public static void main(String[] args) {
        Student[] first = new Student[]{
                new Student(new int[]{3, 3, 3}),
                new Student(new int[]{4, 5, 3}),
                new Student(new int[]{4, 4, 5}),
                new Student(new int[]{5, 5, 5}),
                new Student(new int[]{5, 5, 4}),
                new Student(new int[]{3, 3, 4}),
        };
        Student[] second = new Student[]{
                new Student(new int[]{3, 3, 3}),
                new Student(new int[]{4, 5, 3}),
                new Student(new int[]{4, 4, 5}),
                new Student(new int[]{5, 5, 5}),
                new Student(new int[]{5, 5, 4}),
                new Student(new int[]{3, 3, 4}),
        };
        Run r = new Run();
        System.out.println("До:");
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        Run.mergeSort(first, first[0]);
        Run.mergeSort(second, second[0]);
        Student[] students = new Student[first.length + second.length];
        merge(first, second, students, first[0]);

        System.out.println("После:");
        System.out.println(Arrays.toString(students));
    }

    public static <K> void merge(K[] S1, K[] S2, K[] S, Comparator<K> comp) {
        int i = 0, j = 0;
        while (i + j < S.length) {
            if (j == S2.length
                    || (i < S1.length && comp.compare(S1[i], S2[j]) < 0))
                S[i + j] = S1[i++]; // copy ith element of S1 and increment i
            else
                S[i + j] = S2[j++]; // copy jth element of S2 and increment j
        }
    }

    public static <K> void mergeSort(K[] S, Comparator<K> comp) {
        int n = S.length;
        if (n < 2)
            return; // array is trivially sorted
        // divide
        int mid = n / 2;
        K[] S1 = Arrays.copyOfRange(S, 0, mid); // copy of first half
        K[] S2 = Arrays.copyOfRange(S, mid, n); // copy of second half
        // conquer (with recursion)
        mergeSort(S1, comp); // sort copy of first half
        mergeSort(S2, comp); // sort copy of second half
        // merge results
        merge(S1, S2, S, comp); // merge sorted halves back into original
    }
}
