package modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "adjustedBytes",
    "energy",
    "co2",})
public class Statistics {

    @JsonProperty("adjustedBytes")
    private double adjustedBytes;
    @JsonProperty("energy")
    private double energy;
    @JsonProperty("co2")
    private Co2 co2;

    public Statistics() {
    }

    public Statistics(double adjustedBytes, double energy, Co2 co2) {
        this.adjustedBytes = adjustedBytes;
        this.energy = energy;
        this.co2 = co2;
    }

    public double getAdjustedBytes() {
        return adjustedBytes;
    }

    public void setAdjustedBytes(double adjustedBytes) {
        this.adjustedBytes = adjustedBytes;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public Co2 getCo2() {
        return co2;
    }

    public void setCo2(Co2 co2) {
        this.co2 = co2;
    }

    @Override
    public String toString() {
        return "        adjustedBytes=" + adjustedBytes + ", \n" + "        energy=" + energy + ", \n" + "       co2:" + "\n" + co2 ;
    }

}
