package Fifth;

public class Run {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        String value1 = "+79175655655";
        String value2 = "+101234289652211";
        String value3 = "89175655655";
        System.out.println(Run.convert(value1));
        System.out.println(Run.convert(value2));
        System.out.println(Run.convert(value3));
    }

    public static String convert(String number)
    {
        StringBuilder builder = new StringBuilder(number);
        if (builder.charAt(0) == '+')
        {
            int offset = builder.length() - 10;
            builder.insert(3 + offset, '-').insert(7 + offset, '-');
        }
        else
        {
            builder.setCharAt(0, '+');
            builder.insert(1,  "7").insert(5, '-').insert(9, '-');
        }
        return builder.toString();
    }
}
