package First;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Run {
    public static void main(String[] args) {
        Task[] tasks = new Task[]{
                new Task("Papr1ka", new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis() + 50000), new SimpleDateFormat("dd.MM.YYYY hh:mm:ss")),
                new Task("Papr1ka", new Date(System.currentTimeMillis() + 30000), new Date(System.currentTimeMillis() + 400000), new SimpleDateFormat("dd.MM.YYYY hh:mm:ss"))
        };

        for (Task task: tasks)
        {
            System.out.println(task);
        }
    }
}
