package tbcs;

import tbcs.model.customer.*;
import tbcs.model.order.*;
import tbcs.model.delivery.Driver;
import tbcs.model.feedback.Feedback;
import tbcs.service.*;
import tbcs.persistence.FeedbackRepository;
import tbcs.util.InputUtil;

public class Main {

    public static void main(String[] args) {

        System.out.println("====== TasteBuds Catering System (TBCS) ======");

        // ===== Customer Info =====
        System.out.print("Enter Customer Name: ");
        String name = InputUtil.input.nextLine();

        System.out.print("Is Registered Customer? (true/false): ");
        boolean isRegistered = InputUtil.input.nextBoolean();

        Customer customer;
        int monthlyOrders = 0;

        if (isRegistered) {
            customer = new RegisteredCustomer(name);
            System.out.print("Enter number of orders this month: ");
            monthlyOrders = InputUtil.input.nextInt();
        } else {
            customer = new GuestCustomer(name);
        }

        System.out.print("Enter Bill Amount: ");
        double billAmount = InputUtil.input.nextDouble();

        System.out.print("Is Priority Order? (true/false): ");
        boolean isPriority = InputUtil.input.nextBoolean();

        System.out.print("Enter Order Number: ");
        int orderNo = InputUtil.input.nextInt();

        OrderService orderService = new OrderService();
        Order order = orderService.placeOrder(customer, isPriority, orderNo, billAmount, monthlyOrders);

        System.out.println("\n--- Order Placed ---");
        System.out.println("Order ID: " + order.getId());
        System.out.println("Order Category: " + order.getCategory());
        System.out.println("Final Bill: " + (order.getAmount()));

        KitchenService kitchenService = new KitchenService();
        System.out.println("\n--- Kitchen Preparation ---");
        kitchenService.prepare(order);

        DeliveryService deliveryService = new DeliveryService();
        System.out.println("\n--- Delivery Assignment ---");
        deliveryService.assignDelivery(order.getId(), order.getCategory());

        Driver driver = new Driver("Rahim", "DL-12345");
        InputUtil.input.nextLine();
        System.out.print("Enter Driver License Number: ");
        String enteredLicense = InputUtil.input.nextLine();
        System.out.println("--- Driver Checkout ---");
        deliveryService.checkout(driver, enteredLicense, order.getId());

        System.out.print("Rate your order (1-5): ");
        int rating = InputUtil.input.nextInt();
        InputUtil.input.nextLine();

        System.out.print("Leave a comment: ");
        String comment = InputUtil.input.nextLine();

        Feedback feedback = new Feedback(order.getId(), rating, comment);
        FeedbackRepository feedbackRepository = new FeedbackRepository();
        feedbackRepository.save(feedback);

        System.out.println("\n--- Customer Feedback Recorded ---");
        System.out.println("Thank you for using TasteBuds Catering System!");
    }
}
