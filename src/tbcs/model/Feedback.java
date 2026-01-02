package tbcs.model;

public class Feedback {
    private final int orderNumber;
    private final int rating;
    private final String comment;
    public Feedback(int orderNumber, int rating, String comment)
    {
        this.orderNumber = orderNumber;
        this.rating = rating;
        this.comment = comment;
    }
    @Override
    public String toString()
    {
        return "Order#"+orderNumber+" Rating: "+rating+" Comment: "+comment;
    }
}
