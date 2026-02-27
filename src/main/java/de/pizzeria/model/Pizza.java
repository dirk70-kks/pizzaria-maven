package de.pizzeria.model;
import java.util.ArrayList;

public class Pizza {

    private int pizzanr;
    private String name;
    private String groesse;
    private double basisPreis;
    private ArrayList<Zutaten> zutatenliste;
    private ArrayList<Pizza> pizzaliste;
    
    //Konstruktor
    public Pizza(int pizzanr, String name, String groesse, double basisPreis) {
        
        this.pizzanr = pizzanr;
        this.name = name;
        this.groesse = groesse;
        this.basisPreis = basisPreis;
        this.zutatenliste = new ArrayList<>();
        this.pizzaliste = new ArrayList<>();
        
    }
    //Setter & Getter Methoden
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

    public ArrayList<Zutaten> getZutatenliste() {
        return zutatenliste;
    }

    public void setZutatenliste(ArrayList<Zutaten> zutatenliste) {
        this.zutatenliste = zutatenliste;
    }

    public ArrayList<Pizza> getPizzaliste() {
        return pizzaliste;
    }

    public void setPizzaliste(ArrayList<Pizza> pizzaliste) {
        this.pizzaliste = pizzaliste;
    }
}