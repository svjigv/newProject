import employees.*;
public class Test {
    public static void main(String[] args) {
        Department department = new Department("Development");
        SoftwareEngineer middleDev = new SoftwareEngineer("Андрей", 22, "Разработчик", 160000);
        SoftwareEngineer juniorDev = new SoftwareEngineer("Антон", 22, "Разработчик", 120000);
        TeamLead lead = new TeamLead("Александр", 25, "Тимлид", 260000, "Отдел разработки");
        QA analytic = new QA("Женя", 19, "Тестировщик", 90000);
        department.setNumberOfEmployees(4);
        department.addEmployees(new Employee[]{juniorDev, middleDev, lead,  analytic});
        department.getSummarySalary();
    }
}