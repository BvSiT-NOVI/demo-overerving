package nl.novi.overerving;

import nl.novi.overerving.package1.Knaagdier;
import nl.novi.overerving.package2.Konijn;

public class MainDemoOvererving {
    public static void main(String[] args) {
        Knaagdier eenKD = new Knaagdier("Cavia", "Knabbel");
        Konijn bugs = new Konijn("Bugs Bunnie", "Grijs");
        System.out.println(eenKD.eten());
        System.out.println(bugs.eten());
        System.out.println(bugs.getName());

        //System.out.println(bugs.name); //Compiler zou error geven want Knaagdier.naam is protected en dus niet direct bereikbaar (not in scope)
        //Maar wél BINNEN de afgeleide klasse Konijn. Zie Konijn.getName()
    }
}
