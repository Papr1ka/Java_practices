public class RunFirst
{
    public static void main(String[] args) {
        int n = 213;

//        int current = 1;
//        int count = 1;
//
//        for (int i = 0; i < n; i++) {
//            if (count > 0)
//            {
//                System.out.print(current + " ");
//                count--;
//            }
//            else
//            {
//                count = current;
//                current += 1;
//                System.out.print(current + " ");
//            }
//        }
        RunFirst r = new RunFirst();
        r.next(1, 0, n);
    }

    public void next(int n, int printed, int stop)
    {
        if (printed >= stop)
        {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (printed >= stop)
            {
                return;
            }
            System.out.print(n + " ");
            printed++;
        }
        next(n + 1, printed, stop);
    }
}
