public class RunSecond {
    public static void main(String[] args) {
        int n = 10;
//        n++;
//
//        for (int i = 1; i < n; i++) {
//            System.out.print(i + " ");
//        }
        RunSecond r = new RunSecond();
        r.print(1, n + 1);
    }

    public void print(int n, int stop)
    {
        if (n == stop)
        {
            return;
        }
        System.out.print(n + " ");
        print(n + 1, stop);
    }
}
