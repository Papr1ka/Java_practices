public class BookTest {
    public static void main(String[] args) {
        System.out.format("%-10s %-15s %10s\n", "-----", "BookTest", "-----");

        Bookshelf bs = new Bookshelf();
        bs.addBook("001", "001", 1990);
        bs.addBook("002", "002", 1970);
        bs.addBook("003", "003", 2020);
        bs.addBook("004", "004", 1800);
        bs.addBook("005", "005", 1801);
        bs.addBook("006", "006", 1799);
        System.out.println(bs);
        System.out.format("Latest: %s%n", bs.getLatest());
        System.out.format("Oldest: %s%n", bs.getOldest());
        System.out.println("Sorting...");
        bs.sortBooks();
        System.out.println(bs);

        System.out.format("%-10s %-15s %10s\n", "-----", "BookTestEnd", "-----");
    }
}
