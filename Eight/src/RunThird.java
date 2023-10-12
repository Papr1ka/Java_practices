public class RunThird {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        RunThird r = new RunThird();
        r.print(a, b);
    }

    public void print(int a, int b)
    {
        if (a == b)
        {
            System.out.print(a);
            return;
        }
        if (a > b)
        {
            System.out.print(a + " ");
            print(a - 1, b);
        }
        else
        {
            System.out.print(a + " ");
            print(a + 1, b);
        }
    }
}
