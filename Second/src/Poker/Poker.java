package Poker;

import java.util.Arrays;

public class Poker {
    public static void main(String[] args) {
        int players = 1;
        if (args != null && args.length >= 1)
        {
            players = Integer.parseInt(args[0]);
        }

        if (players * 5 > 52)
        {
            System.out.println("Ошибка, слишком много игроков, колоды не хватит");
            return;
        }
        Colode col = new Colode();

        Card[][] playerColodes = new Card[players][5];

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < players; j++)
            {
                try {
                    playerColodes[j][i] = col.getCard();
                } catch (Exception e) {
                    System.out.println("Колода всё же закончилась");
                    return;
                }
            }
        }

        for (int i = 0; i < players; i++)
        {
            System.out.format("Рука игрока %d: ", i);
            for (int j = 0; j < 5; j++)
            {
                System.out.format("%-15s", playerColodes[i][j]);
            }
            System.out.format("%n%n");
        }
    }
}
