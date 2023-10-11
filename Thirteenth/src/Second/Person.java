package Second;

public class Person {
    private final String fio;

    public Person(String name, String surname, String patronymic) {
        StringBuilder builder = new StringBuilder(surname);
        builder.append(" ").append(surname.charAt(0)).append(".").append(patronymic.charAt(0)).append(".");
        this.fio = builder.toString();
    }

    public Person(String surname) {
        this.fio = surname;
    }

    public Person(String name, String surname) {
        StringBuilder builder = new StringBuilder(surname);
        builder.append(" ").append(surname.charAt(0)).append(".");
        this.fio = builder.toString();
    }

    public String getFIO()
    {
        return this.fio;
    }
}
