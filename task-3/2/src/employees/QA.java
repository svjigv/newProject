package employees;

public class QA extends Employee {
    private int bugsFound;
    public QA(String name, int age, String position, int salary) {
        super(name, age, position, salary);
    }
    public void setBugsFound(int bugsFound) {
        this.bugsFound = bugsFound;
    }
    public int getBugsFound() {
        return bugsFound;
    }
}
