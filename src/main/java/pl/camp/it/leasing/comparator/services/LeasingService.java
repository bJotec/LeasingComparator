package pl.camp.it.leasing.comparator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.camp.it.leasing.comparator.database.ILeasingOptionsDAO;
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
}
