# Access Modifiers

* private
* public
* protected
* package-private (default!)


NB In java kun je een klasse NIET private maken.
Default is een klasse package-private.
Je kunt een klasse wel public maken.

The protected modifier specifies that the member can only be accessed within its own package (as with package-private) and, in addition, by a subclass of its class in another package.

Zie ook <https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html> 

Een subklasse hoeft dus niet in de zelfde package te staan als de superklasse!

NB Protected members zijn wel beschikbaar **BINNEN** de subklasse maar **NIET** direct bereikbaar als je de subklasse instantieert.

Voorbeeld:

    ...
        public static void main(String[] args) {
            SubAlpha sa = new SubAlpha();
            sa.x =3; //Error!!  
        } 
    ...

    public class Alpha {
        protected int x;
        public Alpha() {
            this.x = 5;
        }
        @Override
        public String toString() {
            return Integer.toString(x);
        }
    }
    
    public class SubAlpha extends Alpha{
        public SubAlpha() {
            x=10;  //NB super.x niet nodig
        }
        @Override
        public String toString() {
            return Integer.toString(x); //NB super.x niet nodig!
        }
    }

Opmerkelijk wat betreft overerving: als je in een superklasse een protected instance variable hebt, kun je in een afgeleide subklasse dezelfde variable aanduiden zonder super te gebruiken.

NB Altijd public: 
    public static void main(String[] args)
