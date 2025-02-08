package ganeric_utility;

import java.io.FileInputStream;
import java.util.Properties;

public class File_utility {
public String getKeyAndValuePair(String key) throws Throwable
{
	FileInputStream fis = new FileInputStream(IpathConstant.FilePath);
	Properties pro = new Properties();
	pro.load(fis);
    String value = pro.getProperty(key);
	return value;
}
}
