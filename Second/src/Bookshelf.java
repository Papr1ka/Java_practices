import java.util.Arrays;

public class Bookshelf {
    Book[] books;
    int booksCount;

    public Bookshelf() {
        this.booksCount = 0;
    }

    public Book getLatest()
    {
        if (this.booksCount == 0)
        {
            return null;
        }
        int maxYear = this.books[0].getYear();
        int index = 0;
        for (int i = 1; i < this.booksCount; i++)
        {
            if (this.books[i].getYear() > maxYear)
            {
                maxYear = this.books[i].getYear();
                index = i;
            }
        }
        return this.books[index];
    }

    public Book getOldest()
    {
        if (this.booksCount == 0)
        {
            return null;
        }
        int minYear = this.books[0].getYear();
        int index = 0;
        for (int i = 1; i < this.booksCount; i++)
        {
            if (this.books[i].getYear() < minYear)
            {
                minYear = this.books[i].getYear();
                index = i;
            }
        }
        return this.books[index];
    }

    public void addBook(String author, String name, int year)
    {
        Book book = new Book(author, name, year);
        if (this.books == null)
        {
            this.books = new Book[]{book};
        }
        else
        {
            Book[] newBooks = new Book[this.booksCount + 1];
            System.arraycopy(this.books, 0, newBooks, 0, this.booksCount);
            newBooks[this.booksCount] = book;
            this.books = newBooks;
        }
        this.booksCount += 1;
    }

    public void sortBooks()
    {
        Arrays.sort(this.books);
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + Arrays.toString(books) +
                ", booksCount=" + booksCount +
                '}';
    }
}
