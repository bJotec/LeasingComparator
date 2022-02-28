package pl.camp.it.leasing.comparator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name = "titemmalue")
public class ItemValue {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private int value;

        private int code;

    public ItemValue(int id, int value, int code) {
        this.id = id;
        this.value = value;
        this.code = code;
    }

    public ItemValue() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

