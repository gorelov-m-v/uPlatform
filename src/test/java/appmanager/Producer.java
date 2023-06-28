package appmanager;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Producer extends HelperBase {
    public Producer(ApplicationManager app) {
        super(app);
    }

    private static Properties getProperties() {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "kafka-development-03.b2bdev.pro:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        return properties;
    }

    public ProducerRecord<String, String> createRecord(String topic, String key, String value, String headerKey, String headerValue) {
        ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, value);
        record.headers().add(headerKey, headerValue.getBytes(StandardCharsets.UTF_8));

        return record;
    }

    public ProducerRecord<String, String> createRecord(String topic, String key, String value) {
        return new ProducerRecord<>(topic, key, value);
    }

    public void sendMessage(ProducerRecord record) {
        KafkaProducer kafkaProducer = new KafkaProducer(getProperties());
        kafkaProducer.send(record);
        kafkaProducer.close();
    }
}
