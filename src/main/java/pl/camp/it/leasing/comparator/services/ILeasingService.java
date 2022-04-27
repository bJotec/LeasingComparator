package pl.camp.it.leasing.comparator.services;

import pl.camp.it.leasing.comparator.model.Car;
import pl.camp.it.leasing.comparator.model.Time;

import java.util.List;

public interface ILeasingService {
    List<Time> getTime();
    List<Car> getCar();
    double calculate(int code, int ownContribution, double price);
    double rateConvert(double pln, double mid);
}
