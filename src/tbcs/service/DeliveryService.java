package tbcs.service;

import tbcs.model.Checkoutable;
import tbcs.persistence.CheckoutRepository;
import tbcs.persistence.DeliveryRepository;

public class DeliveryService
{
    private final DeliveryRepository deliveryRepository = new DeliveryRepository();
    private final CheckoutRepository checkoutRepository = new CheckoutRepository();
    public void assignDelivery(int orderNo, String category)
    {
        deliveryRepository.save("Order#" + orderNo+ " assigned (" + category + ")");
    }
    public boolean checkout(Checkoutable entity, String input, int orderNo)
    {
        boolean verified = entity.verify(input);
        checkoutRepository.save("Order#" + orderNo+ " Checkout: " + verified);
        return verified;
    }
}
