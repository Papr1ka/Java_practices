/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;

public class Second
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int summa = 0;
        Scanner stdin = new Scanner(System.in);
        int i = 0;
        while (stdin.hasNextInt())
        {
            arr.add(stdin.nextInt());
            summa += arr.get(arr.size() - 1);
        }
        i = 0;

        int min = arr.get(0);
        int max = min;

        do
        {
            if (arr.get(i) < min)
            {
                min = arr.get(i);
            }
            if (arr.get(i) > max)
            {
                max = arr.get(i);
            }
            i++;
        }
        while (i < arr.size());

        System.out.format("Сумма массива: %d, Максимальный элемент: %d, Минимальный элемент: %d", summa, max, min);
    }
}
