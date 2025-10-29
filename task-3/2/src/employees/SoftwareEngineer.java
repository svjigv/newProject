package employees;

public class SoftwareEngineer extends Employee{
    String grade;
    public SoftwareEngineer(String name, int age, String position, int salary){
        super(name, age, position, salary);
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
