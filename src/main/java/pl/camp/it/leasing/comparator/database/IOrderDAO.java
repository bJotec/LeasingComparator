package pl.camp.it.leasing.comparator.database;

import pl.camp.it.leasing.comparator.model.Order;

import java.util.List;

public interface IOrderDAO {
    void addOrder(Order order);
    List<Order> getOrdersByUserLogin(String login);
}
