package nl.novi.overerving.package2;

import nl.novi.overerving.package1.Knaagdier;

public class Konijn extends Knaagdier {
    private String kleur;
    public Konijn(String naam, String k) {
        super("Konijn", naam);
        this.kleur = k;
    }
    public String eten(){
        return "Lekker worteltjestaart";
    }

    public String getName(){
        return this.naam; //Knaagdier.naam is protected, dus bereikbaar binnen subklasse Konijn, ook als deze in een ander package staat!
    }

}
