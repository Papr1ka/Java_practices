package Task1;

import Task1.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Client client = new Client();

        Chair chair1 = factory.createChair(new MagicChairFactory());
        Chair chair2 = factory.createChair(new FunctionalChairFactory());
        Chair chair3 = factory.createChair(new VictorianChairFactory());

        client.setChair(chair1);
        client.sit();
        client.setChair(chair2);
        client.sit();
        client.setChair(chair3);
        client.sit();
    }
}