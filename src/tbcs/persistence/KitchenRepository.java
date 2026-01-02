package tbcs.persistence;

import tbcs.util.FileUtil;

public class KitchenRepository
{
    public void save(String data)
    {
        FileUtil.write("kitchen.txt", data);
    }
}
