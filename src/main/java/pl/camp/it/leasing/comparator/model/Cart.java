package pl.camp.it.leasing.comparator.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<OrderPosition> positions= new ArrayList<>();



    public List<OrderPosition> getPositions() {
        return positions;
    }

    public void setPositions(List<OrderPosition> positions) {
        this.positions = positions;
    }
}
