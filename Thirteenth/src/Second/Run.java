package Second;

public class Run {
    public static void main(String[] args) {
        Person p1 = new Person("Барбара");
        Person p2 = new Person("Джо", "Барбара");
        Person p3 = new Person("Витторио", "Скалетта", "Антонио");
        System.out.println(p1.getFIO());
        System.out.println(p2.getFIO());
        System.out.println(p3.getFIO());
    }
}
