package de.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private final List<Kunde> kunden;
    private final List<Bestellung> bestellungen;
    private final List<Pizza> pizzas;
    
    public Pizzeria() {
        this.kunden = new ArrayList<>();
        this.bestellungen = new ArrayList<>();
        this.pizzas = new ArrayList<>();
    }

    public void registriereKunde(Kunde kunde) {
        if (kunde != null && !kunden.contains(kunde)) {
            kunden.add(kunde);
        }
    }

    public Bestellung erstelleBestellung(Kunde kunde) {
        if (kunde == null) {
            throw new IllegalArgumentException("Kunde darf nicht null sein");
        }
        Bestellung b = new Bestellung(kunde);
        bestellungen.add(b);
        return b;
    }

    public List<Pizza> getPizzas() {
        return new ArrayList<>(pizzas);
    }
}
