package First;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
    private final int number;
    private int[] results;
    @Override
    public int compareTo(Student o) {
        if (this.number > o.number)
        {
            return 1;
        }
        else if (this.number < o.number)
        {
            return -1;
        }
        return 0;
    }
    public Student(int number) {
        this.number = number;
    }

    public Student(int[] results) {
        this.results = results;
        this.number = 0;
    }

    public Student(int number, int[] results) {
        this.number = number;
        this.results = results;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", results=" + Arrays.toString(results) +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        int r1 = Arrays.stream(o1.results).sum();
        int r2 = Arrays.stream(o2.results).sum();
        if (r1 > r2)
        {
            return 1;
        }
        else if (r1 < r2)
        {
            return -1;
        }
        return 0;
    }
}
