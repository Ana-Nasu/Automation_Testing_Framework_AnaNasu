package com.qa.managers;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesManagers {
    private static Properties properties;

    public static void initializeProperties() {
        properties = new Properties();
        String propertiesFilePath = "src/main/resources/config.properties";

        try {
            properties.load(new FileReader(propertiesFilePath));
        } catch (IIOException exception) {
            exception.printStackTrace();
        }
    }

    public static String getBroserType() {
        if (properties == null) initializeProperties();
        String broserType = properties.getProperty("broserType");
        if (broserType != null) {
            return broserType;
        } else {
            throw new RuntimeException("The broser type was not defined");
        }
    }

    public static String getApplicationURL(){
        if (properties == null) initializeProperties();
        String url = properties.getProperty("url");
        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("The url type was not defined");
        }
    }
    }
}
