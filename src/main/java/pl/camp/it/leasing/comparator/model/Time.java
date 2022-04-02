package pl.camp.it.leasing.comparator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ttime")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int timePeriod;
    private int code;
    private int ownContribution;
    private double calculateLeasing;

    public Time(int id, int timePeriod, int code, int ownContribution, double calculateLeasing) {
        this.id = id;
        this.timePeriod = timePeriod;
        this.code = code;
        this.ownContribution = ownContribution;
        this.calculateLeasing = calculateLeasing;
    }

    public Time() {
    }

    public int getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnContribution() {
        return ownContribution;
    }

    public void setOwnContribution(int ownContribution) {
        this.ownContribution = ownContribution;
    }

    public double getCalculateLeasing() {
        return calculateLeasing;
    }

    public void setCalculateLeasing(double calculateLeasing) {
        this.calculateLeasing = calculateLeasing;
    }
}
