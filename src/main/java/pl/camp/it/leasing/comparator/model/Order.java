package pl.camp.it.leasing.comparator.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name= "torder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Address address;
    @ManyToOne (fetch = FetchType.EAGER)
    private User user;

    private double installment;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Order(int id, Address address, User user, double installment, Status status) {
        this.id = id;
        this.address = address;
        this.user = user;
        this.installment = installment;
        this.status = status;
    }

    public Order() {
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public int getIdForTest(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getInstallment() {
        return installment;
    }

    public void setInstallment(double installment) {
        this.installment = installment;
    }

    public enum Status {
        NEW,
        REALIZATION,
        DELIVERY,
        DONE
    }
}
