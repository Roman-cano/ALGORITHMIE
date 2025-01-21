public class Boucles {
    public static  void main(String[] args) {

        // //////////////////////////////////////
        //               Boucles               //
        // //////////////////////////////////////

        // /////////////////
        // Boucle for
        // ////////////////

        // afficher les nombres de 1 à 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("------------------------------");

        // /////////////////
        // calcul de la somme des N premiers nombres
        // ////////////////
        int n = 20;
        int somme = 0;
        for (int i = 0; i < n ; i++) {
            somme+=i;
        }
        System.out.println("La somme des " + n + " premiers nombres est: " + somme);

        System.out.println("------------------------------");


        // /////////////////
        // carré de nombre
        // ////////////////

        int nombre = 5;
        for (int i = 0; i < nombre; i++) {
            for (int j = 0; j < nombre; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }


        System.out.println("------------------------------");

        // /////////////////
        // triangle de nombre
        // ////////////////
        int nb = 5;
        for (int i = 0; i < nb; i++) {
            for (int y = 0; y < i; y++) {
                System.out.print(i + " ");
            }
            System.out.println("");

        }

        // /////////////////
        // triangle de nombre avec espace
        // ////////////////

        int nb2 = 5;
        for (int i = 0; i < nb; i++) {

            for (int space = 0; space <= nb2 - i +2 -1; space++) {
                System.out.print(" ");
            }
            for (int y = 0; y < i; y++) {
                System.out.print(i + " ");
            }
            System.out.println("");

        }

        System.out.println("------------------------------");


        // /////////////////
        // calcul factoriel
        // ////////////////

        int fact = 5;
        int resultat = 1;
        for (int i = 1; i <= fact; i++) {
            resultat *= i;
        }
        System.out.println("Le factoriel de " + fact + " est: " + resultat);

        System.out.println("------------------------------");

        // /////////////////
        // palindrome
        // ////////////////

        String mot = "kayak";
        boolean estPalindrome = true;
        for (int i = 0; i < mot.length() / 2; i++) {
            if (mot.charAt(i) != mot.charAt(mot.length() - i - 1)) {
                estPalindrome = false;
                break;
            }
        }
        if (estPalindrome) {
            System.out.println(mot + " est un palindrome");
        } else {
            System.out.println(mot + " n'est pas un palindrome");
        }

        System.out.println("------------------------------");
    }

    // /////////////////
    // Boucle while
    // ////////////////
}
