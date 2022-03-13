package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties prop;

    static {
        try {
            prop = new Properties();
            FileInputStream fp = new FileInputStream(System.getProperty("user.dir") + "/config/config.properties");
            prop.load(fp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBrowser() {
        return prop.getProperty("browser");
    }

    public static String getAppUrl() {
        return prop.getProperty("appUrl");
    }

    public static String getUserName() {
        return prop.getProperty("invalidUsername");
    }

    public static String getUserPassword() {
        return prop.getProperty("invalidPassword");
    }
}
