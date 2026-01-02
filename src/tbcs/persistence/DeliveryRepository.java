package tbcs.persistence;

import tbcs.util.FileUtil;

public class DeliveryRepository
{
    public void save(String data)
    {
        FileUtil.write("delivery.txt", data);
    }
}
