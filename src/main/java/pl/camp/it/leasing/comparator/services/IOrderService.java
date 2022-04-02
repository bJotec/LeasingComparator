package pl.camp.it.leasing.comparator.services;

import pl.camp.it.leasing.comparator.model.Address;
import pl.camp.it.leasing.comparator.model.Order;

import java.util.List;

public interface IOrderService {
    void confirmOrder (Address address);
    /*List<Order> getOrdersForCurrentUser();*/
}
