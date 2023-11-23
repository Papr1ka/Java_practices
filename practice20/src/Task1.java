public class Task1 {
    public static void main(String[] args) {
        // это также и Task2
        Box<Integer, String, Long> box = new Box<Integer, String, Long>(10, "Собака", (long)255);
        System.out.println(box.getType());
        System.out.println(box.getValue());
        System.out.println(box.getKey());
        box.printClasses();
    }
}
