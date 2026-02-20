package de.pizzeria.model;
import java.util.List;

public class Pizza {

    private int pizzanr;
    private String name;
    private String groesse;
    private double basisPreis;
    private List<Zutat> zutatenliste;
    
    public Pizza(int pizzanr, string name, string groesse, double basisPreis) {
        
        this.pizzanr = pizzanr;
        this.name = name;
        this.groesse = groesse;
        this.basisPreis = basisPreis;
        this.zutatenliste = newArraylist<>();
        
    }
    
    public double berechnePreis() {
        
        return basisPreis;
    }
}

