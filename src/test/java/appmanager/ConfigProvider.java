package appmanager;

import com.typesafe.config.ConfigFactory;

public class ConfigProvider extends HelperBase {
    public ConfigProvider(ApplicationManager app) {
        super(app);
    }

    static com.typesafe.config.Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }
    public final String KAFKA_BROKER_FIRST = readConfig().getString("kafka.brokers.first");
    public final String KAFKA_BROKER_SECOND = readConfig().getString("kafka.brokers.second");
    public final String KAFKA_BROKER_THIRD = readConfig().getString("kafka.brokers.third");

}
