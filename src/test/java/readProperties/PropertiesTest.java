package readProperties;


import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PropertiesTest {
    @Test
    public void readProperties() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
        String urlFromProperty = System.getProperties().getProperty("url");
    }
}
