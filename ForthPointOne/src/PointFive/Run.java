package PointFive;

import java.util.Date;

public class Run {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Автор1", "Книга1"),
                new Book("Автор2", "Книга2"),
                new Book("Автор3", "Книга3"),
                new Book("Автор4", "Книга4"),
        };
        String[] bookss = new String[]{
                "Книга1",
                "Книга2",
                "Книга3",
        };
        Reader r = new Reader("Павлов К.С.", 190, "ИИТ", new Date(2004, 10, 27), "89859297767");
        r.takeBook();
        r.takeBook(4);
        r.takeBook(bookss);
        r.takeBook(books);
        r.returnBook(books);
        r.returnBook(bookss);
        r.returnBook(4);
        r.returnBook();
    }
}
