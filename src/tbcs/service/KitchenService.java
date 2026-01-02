package tbcs.service;

import tbcs.model.Order;
import tbcs.persistence.KitchenRepository;

public class KitchenService
{
    private final KitchenRepository kitchenRepository =  new KitchenRepository();
    public void prepare(Order order)
    {
        String log = "Preparing Order#" + order.getId() + " Type: " + order.getCategory() + " Estimated Time: 30 mins";
        kitchenRepository.save(log);
    }
}
