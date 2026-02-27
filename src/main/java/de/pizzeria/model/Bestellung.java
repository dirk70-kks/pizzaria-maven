import java.util.Date;
import java.util.List;
 
public class Bestellung {
 
    private int bestellNr;
    private Date bestellDatum;
    private boolean geliefert;
 
             
    private List<Pizza> pizzen;   
  
    public Bestellung(int bestellNr, Date bestellDatum, List<Pizza> pizzen) {
        this.bestellNr = bestellNr;
        this.bestellDatum = bestellDatum;
        this.pizzen = pizzen;
        this.geliefert = false;
    }
    
      public int getBestellNr() {
        return bestellNr;
    }
 
    public Date getBestellDatum() {
        return bestellDatum;
    }
 
    public boolean isGeliefert() {
        return geliefert;
    }
 
    public List<Pizza> getPizzen() {
        return pizzen;
    }
    
    public void addPizza()
            
    {
    
    
    }
 
   public void setGeliefert(boolean geliefert) {
        this.geliefert = geliefert;
    }

public double berechneGesamtpreis() {
        double summe = 0.0;
 
        for (Pizza p : pizzen) {
            summe += p.berechnePreis();
        }
 
        return summe;
    }
}
