package StringFormatTask;

public class Report {
    public static void generateReport(Employee[] employees)
    {
        for (int i = 0; i < employees.length; i++)
        {
            System.out.format("Сотрудник: %-20s Зарплата: %20.2f%n", employees[i].getFullname(), employees[i].getSalary());
        }
    }
}
