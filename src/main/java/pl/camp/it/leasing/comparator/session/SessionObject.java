package pl.camp.it.leasing.comparator.session;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pl.camp.it.leasing.comparator.model.Cart;
import pl.camp.it.leasing.comparator.model.Order;
import pl.camp.it.leasing.comparator.model.Time;
import pl.camp.it.leasing.comparator.model.User;

@Component
@SessionScope
public class SessionObject {
    private User user = null ;
    private Order order = null ;
    private Time time = new Time();

    public boolean isLogged() {
        return this.user != null;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Order getOrder() {return order;}

    public void setOrder(Order order) {this.order = order;}
}
