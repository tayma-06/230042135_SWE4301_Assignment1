package tbcs.model.customer;

import tbcs.interfaces.Discountable;
import tbcs.interfaces.Nameable;

public abstract class Customer implements Nameable, Discountable
{
    private final String name;
    protected Customer(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
