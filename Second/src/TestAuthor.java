import java.util.Formatter;

public class TestAuthor {
    public void test()
    {
        System.out.format("%-10s %-15s %10s\n", "-----", "TestAuthor", "-----");

        Author author = new Author("Джон", "joe@mail.ru", 'm');
        System.out.format("Автор: %s%n", author);
        author.setEmail("test@gmail.com");
        assert author.getEmail().equals("test@gmail.com");
        System.out.format("Новый email: %s%n", "test@gmail.com");
        System.out.format("email: %s%n", author.getEmail());
        System.out.format("Гендер: %s%n", author.getGender());
        System.out.format("Имя: %s%n", author.getName());

        System.out.format("%-10s %-15s %10s\n", "-----", "End TestAuthor", "-----");
    }
}
