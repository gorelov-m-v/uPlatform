package appmanager;

public class ApplicationManager {

    private DbHelper db;

    public DbHelper db() {
        if(db == null) {
            db = new DbHelper(this);
        }
        return db;
    }
}
