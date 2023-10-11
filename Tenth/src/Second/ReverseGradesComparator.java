package Second;

import First.Student;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseGradesComparator implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        int r1 = Arrays.stream(o1.getGrades()).sum();
        int r2 = Arrays.stream(o2.getGrades()).sum();
        if (r1 > r2)
        {
            return -1;
        }
        else if (r1 < r2)
        {
            return 1;
        }
        return 0;
    }
}
