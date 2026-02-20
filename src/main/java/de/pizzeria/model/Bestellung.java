import java.util.Date;
import java.util.List;
 
public class Bestellung {
 
    private int bestellNr;
    private Date bestellDatum;
    private boolean geliefert;
 
    private Kunde kunde;           
    private List<Pizza> pizzen;    
 
  
    public Bestellung(int bestellNr, Date bestellDatum, Kunde kunde, List<Pizza> pizzen) {
        this.bestellNr = bestellNr;
        this.bestellDatum = bestellDatum;
        this.kunde = kunde;
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
 
    public Kunde getKunde() {
        return kunde;
    }
 
    public List<Pizza> getPizzen() {
        return pizzen;
    }
 
   public void setGeliefert(boolean geliefert) {
        this.geliefert = geliefert;
    }
 
}