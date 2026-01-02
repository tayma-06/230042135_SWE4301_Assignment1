package tbcs.util;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtil
{
    public static void write(String file, String data)
    {
        try(FileWriter writer = new FileWriter(file, true))
        {
            writer.write(data + System.lineSeparator());
        }
        catch (IOException e)
        {
            System.out.println("Error writing to file");
        }
    }
}
