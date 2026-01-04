package tbcs.model.customer;

public class GuestCustomer extends Customer
{
    public GuestCustomer(String name)
    {
        super(name);
    }

    @Override
    public double getDiscountRate(int monthlyOrders)
    {
        return 0.0;
    }
}
