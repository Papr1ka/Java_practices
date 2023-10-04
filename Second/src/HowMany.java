public class HowMany {
    public static void main(String[] args) {
        if (args != null)
        {
            System.out.format("Вы ввели %d слов", args.length);
        }
        else
        {
            System.out.println("Вы ввели 0 слов");
        }
    }
}
