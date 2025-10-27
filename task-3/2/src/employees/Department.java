package employees;

public class Department {
    private String name;
    private int numberOfEmployees;
    private Employee[] employees;
    private static int summarySalary = 0;
    public Department(String name){
        this.name = name;
        this.employees = new Employee[numberOfEmployees];
    }
    public void setNumberOfEmployees(int numberOfEmployees){
        this.numberOfEmployees = numberOfEmployees;
    }
    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }
    public void addEmployees(Employee[] employees){
        this.employees = employees;
    }
    public Employee[] getEmployees(){
        return employees;
    }
    public void getSummarySalary(){
        for(int i = 0; i < employees.length; i++){
            summarySalary += employees[i].getSalary();
        }
        System.out.println("Суммарная зарплата отдела: " + summarySalary);
    }
}
