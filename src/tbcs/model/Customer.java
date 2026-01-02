package tbcs.model;

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
