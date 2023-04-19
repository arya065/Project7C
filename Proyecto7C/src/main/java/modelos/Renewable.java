package modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "grams",
    "litres",})

public class Renewable {

    @JsonProperty("grams")
    private double grams;
    @JsonProperty("litres")
    private double litres;

    public Renewable() {
    }

    public Renewable(double grams, double litres) {
        this.grams = grams;
        this.litres = litres;
    }

    public double getGrams() {
        return grams;
    }

    public void setGrams(double grams) {
        this.grams = grams;
    }

    public double getLitres() {
        return litres;
    }

    public void setLitres(double litres) {
        this.litres = litres;
    }

    @Override
    public String toString() {
        return "Renewable{" + "grams=" + grams + ", litres=" + litres + '}';
    }

}
