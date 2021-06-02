# Sourcecode Overerving
Zie //https://replit.com/@NOVI/Overerving

    class Konijn extends Knaagdier{
        private String kleur;
        public Konijn(String naam, String k) {
            super("Konijn", naam);
            this.kleur = k;
        }
        public String eten(){
            return "Lekker worteltjestaart";
        }
    }

    /**
     *
     * @author Ir. Erik Mols epmols@gmail.com
     */
    public class Main {
    
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Knaagdier eenKD = new Knaagdier("Cavia", "Knabbel");
            Konijn bugs = new Konijn("Bugs Bunnie", "Grijs");
    
            System.out.println(eenKD.eten());
            System.out.println(bugs.eten());
        }
    
    }
