package appmanager;

public class ApplicationManager {

    private DbHelper db;
    private Producer producer;

    public DbHelper db() {
        if(db == null) {
            db = new DbHelper(this);
        }
        return db;
    }

    public Producer producer() {
        if(producer == null) {
            producer = new Producer(this);
        }
        return producer;
    }
}
