package Fifth;

public interface Stringable {
    static int count(String s, char symbol)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == symbol)
            {
                count++;
            }
        }
        return count;
    }

    static String getOddString(String s)
    {
        String newString = new String();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1)
            {
                newString += s.charAt(i);
            }
        }
        return newString;
    }

    static String reverseString(String s)
    {
        String newString = new String();
        for (int i = 0; i < s.length(); i++) {

            newString = s.charAt(i) + newString;
        }
        return newString;
    }
}
