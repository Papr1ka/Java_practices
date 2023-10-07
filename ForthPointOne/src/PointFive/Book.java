package PointFive;

public class Book {
    private final String name;
    private final String author;

    public Book(String author, String name) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
