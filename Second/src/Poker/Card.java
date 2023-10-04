package Poker;

import java.util.Formatter;

public class Card {
    private int value;
    private int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.setSuit(suit);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSuit() {
        return this.suit;
    }

    public void setSuit(int suit) {
        if (suit < 0 || suit > 3)
        {
            this.suit = suit % 4;
        }
        else
        {
            this.suit = suit;
        }
    }

    @Override
    public String toString() {
        Formatter f = new Formatter();
        String s = switch (this.suit) {
            case 0 -> "Черви";
            case 1 -> "Буби";
            case 2 -> "Пики";
            case 3 -> "Крести";
            default -> "";
        };
        if (this.value > 10)
        {
            String n = switch (this.value) {
                case 11 -> "Валет";
                case 12 -> "Дама";
                case 13 -> "Король";
                case 14 -> "Туз";
                default -> "";
            };
            return f.format("%s %s", n, s).toString();
        }
        return f.format("%d %s", this.value, s).toString();
    }
}
