package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    private static Properties properties;
    static {
        try{
            properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/config/config.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    public static String get(String key){
        return properties.getProperty(key);
    }

}
