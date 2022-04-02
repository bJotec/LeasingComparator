package pl.camp.it.leasing.comparator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.camp.it.leasing.comparator.database.IOrderDAO;
import pl.camp.it.leasing.comparator.model.Address;
import pl.camp.it.leasing.comparator.model.Order;
import pl.camp.it.leasing.comparator.model.Time;
import pl.camp.it.leasing.comparator.session.SessionObject;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class OrderService implements IOrderService {

    @Resource
    SessionObject sessionObject;

    @Autowired
    IOrderDAO orderDAO;

    @Override
    public void confirmOrder(Address address) {

        Time time = this.sessionObject.getTime();

        Order order = new Order();

        order.setAddress(address);
        order.setUser(this.sessionObject.getUser());

        order.setInstallment(this.sessionObject.getOrder().getInstallment());

        order.setStatus(Order.Status.NEW);
        this.orderDAO.addOrder(order);


    }
}
