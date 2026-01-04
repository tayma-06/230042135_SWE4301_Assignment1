package tbcs.model.customer;

public class RegisteredCustomer extends Customer
{
    public RegisteredCustomer(String name)
    {
        super(name);
    }
    @Override
    public double getDiscountRate(int monthlyOrders)
    {
        if(monthlyOrders >= 10)
        {
            return 0.15;
        }
        if(monthlyOrders >= 5)
        {
            return 0.10;
        }
        return 0.05;
    }
}
