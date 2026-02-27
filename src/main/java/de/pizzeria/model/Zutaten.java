package de.pizzeria.model;
public class Zutaten {
    
    private String name;
    private double aufpreis;

    
    public Zutaten(String name, double aufpreis) {
        this.name = name;
        this.aufpreis = aufpreis;
    }

  
    public String getName() {
        return name;
    }

    public double getAufpreis() {
        return aufpreis;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public void setAufpreis(double aufpreis) {
        this.aufpreis = aufpreis;
    }

}