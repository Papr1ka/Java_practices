public class Fifth {
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

    private static int factorial(int number)
    {
        if (number < 0)
        {
            return -1;
        }
        int result = 1;
        for (int i = 1; i <= number; i++)
        {
            result *= i;
        }
        return result;
    }
}
