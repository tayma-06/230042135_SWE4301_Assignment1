package tbcs.model;

public class Driver implements Nameable, Checkoutable{
    private final String name;
    private final String licenseNumber;
    public Driver(String name, String licenseNumber)
    {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }
    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public boolean verify(String input)
    {
        return licenseNumber.equals(input);
    }
    public String getLicenseNumber()
    {
        return licenseNumber;
    }
}
