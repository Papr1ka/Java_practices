package Fifth;

public class Run {
    public static void main(String[] args) {
        String s = "Шла Саша по шоссе и сосала сушку";
        System.out.println(s);
        System.out.println("только чётные буквы: " + Stringable.getOddString(s));
        System.out.println("букв 'с': " + Stringable.count(s, 'с'));
        System.out.println(Stringable.reverseString(s));
    }
}
