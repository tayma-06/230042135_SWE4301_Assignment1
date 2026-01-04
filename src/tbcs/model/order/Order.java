package tbcs.model.order;

public abstract class Order
{
    private final int orderNumber;
    private final double amount;
    protected Order(int orderNumber, double amount)
    {
        this.orderNumber = orderNumber;
        this.amount = amount;
    }
    public int getId()
    {
        return orderNumber;
    }
    public double getAmount()
    {
        return amount;
    }
    public abstract String getCategory();
}
