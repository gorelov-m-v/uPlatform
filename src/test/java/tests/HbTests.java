package tests;

import appmanager.ApplicationManager;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.testng.annotations.Test;

public class HbTests {

    public ApplicationManager app = new ApplicationManager();

    @Test
    public void dbConnectionTest() throws InterruptedException {
        System.out.println(app.db().getAccountById(1));
    }

    @Test
    public void kafkaConnectionTest() {
        ProducerRecord record = app.producer().createRecord("beta-02_core.limits.v1.spent",
                                                             "testKey",
                                                            "testMessage",
                                                            "uuid",
                                                            "323dsfdsufhsdlfh");
        app.producer().sendMessage(record);
    }

    @Test
    public void readFromConf() {
        String host = app.config().KAFKA_BROKER_FIRST;
        System.out.println(host);
    }
}
