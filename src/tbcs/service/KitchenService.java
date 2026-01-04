package tbcs.service;

import tbcs.model.kitchen.Chef;
import tbcs.model.order.HeadChef;
import tbcs.model.order.Order;
import tbcs.persistence.KitchenRepository;

import java.util.List;

public class KitchenService {

    private final KitchenRepository kitchenRepository = new KitchenRepository();
    private final HeadChef headChef = new HeadChef("Chef Karim");

    private final List<Chef> availableChefs = List.of(
            new Chef("Chef A"),
            new Chef("Chef B")
    );

    public void prepare(Order order) {

        String preparationLog =
                headChef.prepareOrder(order, availableChefs);

        kitchenRepository.save(preparationLog);
        System.out.println(preparationLog);
    }
}
