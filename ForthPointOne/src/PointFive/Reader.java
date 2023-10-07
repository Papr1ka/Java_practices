package PointFive;

import java.util.Date;

public class Reader {
    private String fio;
    private int readNumber;
    private String faq;
    private Date born;
    private String number;

    public Reader(String fio, int readNumber, String faq, Date born, String number) {
        this.fio = fio;
        this.readNumber = readNumber;
        this.faq = faq;
        this.born = born;
        this.number = number;
    }

    public void takeBook()
    {
        System.out.format("%s Взял книгу%n", this.fio);
    }
    public void takeBook(int amount)
    {
        System.out.format("%s Взял %d книг%n", this.fio, amount);
    }

    public void takeBook(String[] names)
    {
        System.out.print(this.fio + " Взял книги:");
        for (String name : names)
        {
            System.out.print(" " + name);
        }
        System.out.println();
    }

    public void takeBook(Book[] books)
    {
        System.out.print(this.fio + " Взял книги:");
        for (Book book : books)
        {
            System.out.print(" " + book.getName());
        }
        System.out.println();
    }

    public void returnBook()
    {
        System.out.format("%s Вернул книгу%n", this.fio);
    }
    public void returnBook(int amount)
    {
        System.out.format("%s Вернул %d книг%n", this.fio, amount);
    }

    public void returnBook(String[] names)
    {
        System.out.print(this.fio + " Вернул книги:");
        for (String name : names)
        {
            System.out.print(" " + name);
        }
        System.out.println();
    }

    public void returnBook(Book[] books)
    {
        System.out.print(this.fio + " Вернул книги:");
        for (Book book : books)
        {
            System.out.print(" " + book.getName());
        }
        System.out.println();
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getReadNumber() {
        return readNumber;
    }

    public void setReadNumber(int readNumber) {
        this.readNumber = readNumber;
    }

    public String getFaq() {
        return faq;
    }

    public void setFaq(String faq) {
        this.faq = faq;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
