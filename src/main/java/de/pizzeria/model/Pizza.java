package de.pizzeria.model;
import java.util.List;

public class Pizza {

    private int pizzanr;
    private String name;
    private String groesse;
    private double basisPreis;
    private List<Zutat> zutatenliste;
    private List<Pizza> pizzaliste;
    
    public Pizza(int pizzanr, string name, string groesse, double basisPreis) {
        
        this.pizzanr = pizzanr;
        this.name = name;
        this.groesse = groesse;
        this.basisPreis = basisPreis;
        this.zutatenliste = newArraylist<>();
        this.pizzaliste = newArrayList<>();
        
    }
    
    public void addPizza(Pizza pizza) {
        
        this.pizzaliste.add(pizza);
    }
    
    public double berechnePreis() {
        
        return basisPreis;
    }

    public int getPizzanr() {
        return pizzanr;
    }

    public void setPizzanr(int pizzanr) {
        this.pizzanr = pizzanr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroesse() {
        return groesse;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    public double getBasisPreis() {
        return basisPreis;
    }

    public void setBasisPreis(double basisPreis) {
        this.basisPreis = basisPreis;
    }

    public List<Zutat> getZutatenliste() {
        return zutatenliste;
    }

    public void setZutatenliste(List<Zutat> zutatenliste) {
        this.zutatenliste = zutatenliste;
    }

    public List<Pizza> getPizzaliste() {
        return pizzaliste;
    }

    public void setPizzaliste(List<Pizza> pizzaliste) {
        this.pizzaliste = pizzaliste;
    }
}


