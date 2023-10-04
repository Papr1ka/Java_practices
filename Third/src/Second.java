public class Second {
    public static void main(String[] args) {
        Tester test = new Tester(10);
        System.out.println("Созданы новые окружности");
        System.out.println(test);
        System.out.println("Минимум: " + test.getMin());
        System.out.println("Максимум: " + test.getMax());
        System.out.println("Сортировка...");
        test.sort();
        System.out.println(test);
    }
}
