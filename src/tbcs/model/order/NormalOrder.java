package tbcs.model.order;

public class NormalOrder extends Order
{
    public NormalOrder(int orderNumber, double amount)
    {
        super(orderNumber, amount);
    }
    @Override
    public String getCategory()
    {
        return "Normal";
    }
}
