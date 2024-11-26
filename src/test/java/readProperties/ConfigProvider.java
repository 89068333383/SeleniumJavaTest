package readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProperties")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

    String URL = readConfig().getString("url");
    String URL2 = readConfig().getString("url2");
    String USER_LOGIN = readConfig().getString("usersParams.login");
    String USER_PASSWORD = readConfig().getString("usersParams.passwodr");
}
