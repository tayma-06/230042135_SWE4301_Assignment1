package tbcs.persistence;

import tbcs.util.FileUtil;

public class CheckoutRepository
{
    public void save(String data)
    {
        FileUtil.write("checkout.txt", data);
    }
}
