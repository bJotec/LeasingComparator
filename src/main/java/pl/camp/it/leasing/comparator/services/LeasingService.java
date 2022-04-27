package pl.camp.it.leasing.comparator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.camp.it.leasing.comparator.database.ILeasingOptionsDAO;
import pl.camp.it.leasing.comparator.model.Car;
import pl.camp.it.leasing.comparator.model.Time;

import java.util.List;

@Service
public class LeasingService implements ILeasingService {
    @Autowired
    ILeasingOptionsDAO leasingOptionsDAO;

    @Override
    public List<Time> getTime() {
        return this.leasingOptionsDAO.getTime();
    }

    @Override
    public List<Car> getCar() {
        return this.leasingOptionsDAO.getCar();
    }

    @Override
    public double calculate(int code, int ownContribution, double price) {

        return 1.2*((price-ownContribution)/code);
    }

    @Override
    public double rateConvert(double pln, double mid) {
        return Math.round((pln/mid) * 100.0) / 100.0;
    }
}
