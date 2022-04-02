package pl.camp.it.leasing.comparator.model.dto;

public class LeasingDTO {
    private int lenght;
    private int wklad;
    private double car;
    private boolean check;

    public LeasingDTO(int lenght, int wklad, double car, boolean check) {
        this.lenght = lenght;
        this.wklad = wklad;
        this.car = car;
        this.check = check;
    }

    public LeasingDTO() {
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWklad() {
        return wklad;
    }

    public void setWklad(int wklad) {
        this.wklad = wklad;
    }

    public double getCar() {
        return car;
    }

    public void setCar(double car) {
        this.car = car;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
