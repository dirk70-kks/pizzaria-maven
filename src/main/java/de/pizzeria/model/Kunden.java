package de.pizzeria.model;
public class Kunden {
    private double kundennumer; 
    private String name;
    private String adresse;
    private String Telefonnummer;

   //Konstruktor 
    public Kunden(int kundennummer, String name, String adresse, String telefonnummer){
       this.kundennumer = kundennummer;
       this.name = name;
       this.adresse = adresse;
       this.Telefonnummer = telefonnummer;
    
    }
//Rückgabe Methode fuer Kunde
    public double getKunden() {
        return kundennumer;
    }
    public String getName(){
        return name;
    }
    // Rückgabe Adresse
    public String getAdresse(){
        return adresse;
    }
    //
    public String getTelefonnummer(){
        return Telefonnummer;
    }
//Rückgabe Kundennummer
    public void setKundenummer(double kundennummer) {
        this.kundennumer = kundennummer;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public void seTelefonnummer (String Telefonnummer){
        this.Telefonnummer = Telefonnummer;
    }
}

