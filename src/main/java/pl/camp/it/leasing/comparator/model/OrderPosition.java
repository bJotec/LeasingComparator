package pl.camp.it.leasing.comparator.model;

import javax.persistence.*;

@Entity(name= "torderposition")
public class OrderPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(fetch = FetchType.EAGER)
    private Car car;
    private int positionQuantity;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getPositionQuantity() {
        return positionQuantity;
    }

    public void setPositionQuantity(int positionQuantity) {
        this.positionQuantity = positionQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void increaseQuantity() {
        this.positionQuantity++;
    }
}