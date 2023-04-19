package modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "grid",
    "renewable",})

public class Co2 {

    @JsonProperty("grid")
    private Grid grid;
    @JsonProperty("renewable")
    private Renewable renewable;

    public Co2() {
    }

    public Co2(Grid grid, Renewable renewable) {
        this.grid = grid;
        this.renewable = renewable;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public Renewable getRenewable() {
        return renewable;
    }

    public void setRenewable(Renewable renewable) {
        this.renewable = renewable;
    }

    @Override
    public String toString() {
        return "Co2{" + "grid=" + grid + ", renewable=" + renewable + '}';
    }

}
