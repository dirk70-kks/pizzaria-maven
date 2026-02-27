package de.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private Liste<Kunde> kunden;
    private Liste<Bestellung> bestellungen;
    private Liste<Pizza> pizzas;

    public Pizzeria() {
        this.kunden = new Liste<>();
        this.bestellungen = new Liste<>();
        this.pizzas = new Liste<>();
    }


    public void registriereKunde(Kunde k) {
        if (k != null && !kunden.contains(k)) {
            kunden.add(k);
        }
    }


    public Bestellung erstelleBestellung(Kunde k) {
        if (k == null) {
            throw new IllegalArgumentException("Kunde darf nicht null sein");
        }
        Bestellung b = new Bestellung(k);
        bestellungen.add(b);
        return b;
    }


    public List<Pizza> getPizzas() {
        return new ArrayList<>(pizzas);
    }
    
}


