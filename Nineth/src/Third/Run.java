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
        System.out.println(Arrays.toString(iDNumber));
        r.quickSort(iDNumber, 0, iDNumber.length - 1);
        System.out.println("После:");
        System.out.println(Arrays.toString(iDNumber));
        mergeSortInner(first, second, )
    }
    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
