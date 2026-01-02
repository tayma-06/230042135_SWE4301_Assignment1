package tbcs.model;

public class PriorityOrder extends Order
{
    public PriorityOrder(int orderNumber, double amount)
    {
        super(orderNumber, amount);
    }
    @Override
    public String getCategory()
    {
        return "Priority";
    }
}
