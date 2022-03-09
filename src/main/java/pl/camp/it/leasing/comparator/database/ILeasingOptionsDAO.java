package pl.camp.it.leasing.comparator.database;

import pl.camp.it.leasing.comparator.model.Car;
import pl.camp.it.leasing.comparator.model.Time;

import java.util.List;

public interface ILeasingOptionsDAO {
    List<Time> getTime();
    void timePeriod();

    List<Car> getCar();
}
