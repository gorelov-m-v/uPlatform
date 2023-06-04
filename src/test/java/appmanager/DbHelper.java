package appmanager;

import model.database.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.concurrent.TimeUnit;

public class DbHelper extends HelperBase {

    public DbHelper(ApplicationManager app) {
        super(app);
    }
    SessionFactory sessionFactory;


    public Account getAccountById(int id) throws InterruptedException {
        sessionFactory = new Configuration().configure("hibernate-player.cfg.xml").buildSessionFactory();

        TimeUnit.SECONDS.sleep(2);
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Account result = session.createQuery(
                String.format("from model.database.Account where id = '%s'", id), Account.class).uniqueResult();

        session.getTransaction().commit();
        session.close();

        return result;
    }
}
