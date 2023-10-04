package Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Colode {

    private HashMap<Integer, Card> colode;
    private ArrayList<Integer> indexes;
    public Colode() {
        this.colode = new HashMap<>();
        for (int i = 0; i < 52; i++)
        {
            this.colode.put(i, new Card(2 + i / 4, i));
        }
        this.indexes = new ArrayList<>();
        for (int i = 0; i < 52; i++)
        {
            this.indexes.add(i);
        }
        Card[] cs = new Card[52];
        for (int i = 0; i < 52; i++)
        {
            cs[i] = this.colode.get(i);
        }
        System.out.println(Arrays.toString(cs));
    }

    public Card getCard() throws Exception {
        if (this.colode.isEmpty())
        {
            throw new Exception("Colode is empty");
        }
        int index = new Random().nextInt(this.indexes.size());
        int cardIndex = this.indexes.get(index);
        this.indexes.remove(index);
        return this.colode.get(cardIndex);
    }

    public int getSize()
    {
        return this.colode.size();
    }
}
