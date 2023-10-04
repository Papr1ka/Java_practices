package StringFormatTask;

public class EmployeeReportTester {
    private Employee[] employees;

    public EmployeeReportTester() {
        this.employees = new Employee[]{new Employee("Джо", 10500),
                new Employee("Боб", 300000),
                new Employee("Мистер полено", 80000000)
        };
        Report.generateReport(this.employees);
    }
}
