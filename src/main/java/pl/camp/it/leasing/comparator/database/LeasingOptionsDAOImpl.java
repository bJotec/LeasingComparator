package pl.camp.it.leasing.comparator.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.camp.it.leasing.comparator.model.Time;

import java.util.List;

@Repository
public class LeasingOptionsDAOImpl implements ILeasingOptionsDAO{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Time> getTime() {
        Session session = this.sessionFactory.openSession();
        Query<Time> query = session.createQuery("FROM pl.camp.it.leasing.comparator.model.Time ");
        List<Time> time = query.getResultList();
        session.close();
        return time;
    }

}
