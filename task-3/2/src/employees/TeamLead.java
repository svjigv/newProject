package employees;

public class TeamLead extends Employee {
    private String teamName;
    public TeamLead(String name, Integer age, String position, int salary, String teamName) {
        super(name, age, position, salary);
        this.teamName = teamName;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
