package tbcs.persistence;

import tbcs.model.order.Order;
import tbcs.util.FileUtil;

public class OrderRepository
{
    public void save(Order order)
    {
        FileUtil.write("order.txt", "Order#"+order.getId()+" Category: "+order.getCategory()+" Amount: " +order.getAmount());
    }
}
