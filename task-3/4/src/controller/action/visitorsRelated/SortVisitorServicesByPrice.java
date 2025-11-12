package controller.action.visitorsRelated;

import controller.IAction;
import services.*;

public class SortVisitorServicesByPrice implements IAction {
    private VisitorService visitor;
    public SortVisitorServicesByPrice(VisitorService visitor) {
        this.visitor = visitor;
    }
    @Override
    public void execute() {
        System.out.println("Список услуг гостя по цене: ");
        VisitorService.sortByPrice();
    }
}
