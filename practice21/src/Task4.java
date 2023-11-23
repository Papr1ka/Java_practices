import java.io.File;
import java.util.ArrayList;

public class Task4<E> {
    public static void main(String[] args) {
        ArrayList<File> lst = new ArrayList<File>();
        File dir = new File("../");
        for (File item : dir.listFiles()) {
            lst.add(item);
        }

        for (int i = 0; (i < 5) && (i < lst.size()); i++) {
            System.out.println(lst.get(i).getName());
        }
    }
}
