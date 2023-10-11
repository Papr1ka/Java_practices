package Sixth;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Run {
    public static void main(String[] args) throws IOException {
        Path path = Path.of(".//" + args[0]);
        String line = Files.readString(path);
        System.out.println(Run.getLine(line.split(" ")));
    }

    public static boolean contains(int[] values, int value)
    {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value)
            {
                return true;
            }
        }
        return false;
    }

    public static String getLine(String... words) {
        if (words.length < 1)
        {
            return "";
        }
        if (words.length < 2)
        {
            return words[0];
        }
        String compare1;
        String compare2;
        StringBuilder end = new StringBuilder(words[0]);
        char last;
        char first;
        int[] filtered = new int[words.length];
        filtered[0] = 0;
        for (int i = 1; i < filtered.length; i++)
        {
            filtered[i] = -1;
        }

        int filteredIndex = 0;

        int currentWord = 0;
        while (filteredIndex < filtered.length - 1) {
            int i = currentWord;
            for (int j = 0; j < words.length; j++)
            {
                if (j == i)
                {
                    continue;
                }
                if (words[i].charAt(words[i].length() - 1) == words[j].charAt(0) && (!Run.contains(filtered, j)))
                {
                    end.append(" ");
                    end.append(words[j]);
                    filteredIndex++;
                    filtered[filteredIndex] = j;
                    currentWord = j;
                    break;
                }
            }
        }
        for (int i = 0; i < words.length; i++)
        {
            if (!Run.contains(filtered, i))
            {
                end.append(" ");
                end.append(words[i]);
            }
        }
        return end.toString();
    }
}
