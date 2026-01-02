package tbcs;

import tbcs.model.*;
import tbcs.persistence.FeedbackRepository;
import tbcs.service.*;
import tbcs.util.InputUtil;

public class Main
{
    public static void main(String[] args) {
        System.out.println("------TasteBuds Catering System------");
        System.out.println("Customer Name: ");
        String name = InputUtil.input.nextLine();
        Customer customer= new RegisteredCustomer(name);
        System.out.println("Monthly Orders: ");
        int monthlyOrders = InputUtil.input.nextInt();
        System.out.println("Bill Amount: ");
        double billAmount = InputUtil.input.nextDouble();
        System.out.println("Priority Order? (true/false): ");
        boolean priority =  InputUtil.input.nextBoolean();
        OrderService orderService = new OrderService();
        Order order = orderService.placeOrder(customer, priority, 101, billAmount, monthlyOrders);
        System.out.println("Order placed: #" + order.getId());
        KitchenService kitchenService = new KitchenService();
        kitchenService.prepare(order);
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.assignDelivery(order.getID(), order.getCategory());
        Driver driver = new Driver("Rahim", "DL1234");
        InputUtil.input.nextLine();
        System.out.println("Enter License Number: ");
        String license = InputUtil.input.nextLine();
        deliveryService.checkout(driver, license, order.getId());
        System.out.println("Rating (1-5): ");
        int rating = InputUtil.input.nextInt();
        InputUtil.input.nextLine();
        System.out.println("Comment: ");
        String comment = InputUtil.input.nextLine();
        Feedback feedback = new Feedback(order.getID(), rating, comment);
        FeedbackRepository feedbackRepository = new FeedbackRepository();
        feedbackRepository.save(feedback);
        System.out.println("Thank you for using TBCS!");
    }
}
