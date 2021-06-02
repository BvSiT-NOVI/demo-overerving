package nl.novi.overerving.package1;

//Als je public weg laat voor class is de acces modifier package-private (per default)
//En dan dus niet bereikbaar (out of scope) voor alle klassen in package2
public class Knaagdier {
    protected String soort; //Protected = bereikbaar binnen zelfde package én binnen afgeleide klassen (Konijn bijv.)
    protected String naam;
    protected int x;

    public Knaagdier(String soort, String naam) {
        this.soort = soort;
        this.naam = naam;
    }

    public String eten(){
        return "knaag knaag";
    }

}