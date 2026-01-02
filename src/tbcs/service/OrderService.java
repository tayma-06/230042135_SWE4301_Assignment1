package tbcs.service;

import tbcs.model.*;
import tbcs.persistence.OrderRepository;

public class OrderService
{
    private OrderRepository orderRepository = new OrderRepository();

    public Order placeOrder(Customer customer, boolean priority, int orderNo, double bill, int monthlyOrders)
    {
        double discount = bill * customer.getDiscountRate(monthlyOrders);
        double finalAmount = bill - discount;
        Order order = priority ? new PriorityOrder(orderNo, finalAmount) : new NormalOrder(orderNo, finalAmount);
        orderRepository.save(order);
        return order;
    }
}
