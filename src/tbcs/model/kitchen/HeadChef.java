package tbcs.model.kitchen;

import tbcs.model.order.Order;

import java.util.List;

public class HeadChef extends Chef {

    public HeadChef(String name) {
        super(name);
    }

    public String prepareOrder(Order order, List<Chef> chefs) {

        int estimatedTime;
        if (order.getCategory() == "Priority") {
            estimatedTime = 25;
        } else {
            estimatedTime = 40;
        }

        String chefNames = "";
        for (Chef chef : chefs) {
            chefNames += chef.getName() + " ";
        }

        String log = "HeadChef: " + getName() + "\n"
                + "Order #" + order.getId() + "\n"
                + "Category: " + order.getCategory() + "\n"
                + "Assigned Chefs: " + chefNames + "\n"
                + "Estimated Time: " + estimatedTime + " mins\n"
                + "Status: Preparation Started\n";

        return log;
    }
}
