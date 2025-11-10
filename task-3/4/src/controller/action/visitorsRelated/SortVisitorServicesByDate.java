package controller.action.visitorsRelated;
import controller.IAction;
import services.*;


public class SortVisitorServicesByDate implements IAction{
    private VisitorService visitor;
    public SortVisitorServicesByDate(VisitorService visitor) {
        this.visitor = visitor;
    }
    @Override
    public void execute() {
        System.out.println("Список услуг постояльца по дате: ");
        visitor.sortByDate();
    }
}
