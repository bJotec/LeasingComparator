package pl.camp.it.leasing.comparator.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.camp.it.leasing.comparator.model.Car;
import pl.camp.it.leasing.comparator.model.Time;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;

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

    @Override
    public void timePeriod() {
        Session session = this.sessionFactory.openSession();
        Query<Time> query = session.createQuery("FROM pl.camp.it.leasing.comparator.model.Time WHERE = :");
        List<Time> time = query.getResultList();
        session.close();
        return;
    }

    @Override
    public List<Car> getCar() {
        Session session = this.sessionFactory.openSession();
        Query<Car> query = session.createQuery("FROM pl.camp.it.leasing.comparator.model.Car ");
        List<Car> car = query.getResultList();
        session.close();
        return car;
    }

}
