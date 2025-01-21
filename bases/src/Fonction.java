public class Fonction {
    public static void main(String[] args) {

        // ///////////////////////////////////////////////////////////////////////////////////////////
        // Fonction                                                                                 //
        // 1 pour déclarer une fonction on utilise le mot clé public suivi de static                //
        // 2 ensuite on determine si c'est une procédure ou un fonction                             //
        // 3 si c'est une procédure on utilise void,une procédure ne retourne rien                  //
        // 4 si c'est une fonction on utilise le type de retour int, boolean, String, double, etc...//
        // 5 ensuite on donne le nom de la fonction                                                 //
        // 6 et on ouvre les parenthèses                                                            //
        // 7 si la fonction prend des paramètres on les déclare entre les parenthèses               //
        // 8 ensuite on ouvre les accolades                                                         //
        // 9 on écrit le code de la fonction                                                        //
        // 10 ensuite on ferme les accolades                                                        //
        // ///////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Hello, World!");
        System.out.println( estPalindrome("kayak"));
        System.out.println("------------------------------");
        System.out.println( convertirBase(3210, 16));
        System.out.println("------------------------------");

        System.out.println( factoriel(5));
        System.out.println("------------------------------");
        drawRectangle(5, 10);
        System.out.println("------------------------------");
        drawSquare(5);
        System.out.println("------------------------------");
        String chaine = "bonjour";
        eliminerDoublon(chaine);
        System.out.println(chaine);


    }

    public static boolean estPalindrome(String chaine) {
        boolean palindrome = true;
        for (int i = 0; i < chaine.length(); i++) {
            if(chaine.charAt(i) != chaine.charAt(chaine.length() - i - 1)) {
                palindrome = false;
                return palindrome;

            }
        }
        return palindrome;
    }


    public static String convertirBase(int nombre, int base) {
        //uniquement les bases 2,3,4,5,6,7,8,9
        String resultat = "";
        while (nombre > 0) {
            resultat = nombre % base + resultat;
            nombre = nombre / base;
        }
        return resultat;
    }

    public static int factoriel(int n) {
        int resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat = resultat * i;
        }
        return resultat;
    }

    public static void drawRectangle(int longueur, int largeur) {
        for (int i = 0; i < longueur; i++) {
            for (int j = 0; j < largeur; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public static void drawSquare(int longueur) {
        for (int i = 0; i < longueur; i++) {
            for (int j = 0; j < longueur; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public static String eliminerDoublon(String chaine) {
        String resultat = "";
        for (int i = 0; i < chaine.length(); i++) {
            if (resultat.indexOf(chaine.charAt(i)) == -1) {
                resultat += chaine.charAt(i);
            }
        }
       return resultat;
    }
}
