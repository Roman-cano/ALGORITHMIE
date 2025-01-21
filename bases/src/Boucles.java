public class Boucles {
    public static void main(String[] args) {

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
        for (int i = 0; i < n; i++) {
            somme += i;
        }
        System.out.println("La somme des " + n + " premiers nombres est: " + somme);

        System.out.println("------------------------------");


        // /////////////////
        // dessin d'un carré de nombre
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

            for (int space = 0; space <= nb2 - i + 2 - 1; space++) {
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





        // /////////////////
        // table de multiplication jusqu'a n
        // ////////////////

        int nbr = 5;
        int j = 0;
        for (int i = 0; i < 5 ; i++) {
            for ( j = 0; j < 10; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "| ");
            }
            System.out.println("");
            System.out.println("------------------------------");
        }


        // /////////////////
        // Boucle while
        // ////////////////

        // afficher les nombres de 1 à 10

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("------------------------------");


        // /////////////////
        // compter le nombre de voyelles dans un mot
        // ////////////////

        String mot2 = "bonjour";
        int index = 0;
        int nbVoyelles = 0;
        while(index < mot2.length()) {
            char lettre = mot2.charAt(index);
            if(lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u' || lettre == 'y') {
                nbVoyelles++;
            }
            index++;
        }
        System.out.println("Le mot " + mot2 + " contient " + nbVoyelles + " voyelles");

        System.out.println("------------------------------");

        // /////////////////
        // compter le
        int monNbr = 9875;
        int result = 0;

        while (monNbr >= 10) {
            result = 0;


            while (monNbr > 0) {
                result += monNbr % 10;
                monNbr = monNbr / 10;
            }


            monNbr = result;
        }

        // Afficher le résultat final
        System.out.println("La réduction numérique est : " + monNbr);
        System.out.println("------------------------------");

        // /////////////////
        // Boucle do while
        // ////////////////

        // afficher les nombres de 1 à 10
        int doWhileN = 0;
        do {

            doWhileN++;
            System.out.println(doWhileN);

        } while(doWhileN < 10);



        System.out.println("------------------------------");

        // 
        // fait la somme des chiffres d'un nombre
        int nbrDecomp = 2950;
        int resultDecomp = 0;
        do {
            resultDecomp += nbrDecomp % 10;
            nbrDecomp = nbrDecomp / 10;
            System.out.println(resultDecomp);
        }while (nbrDecomp > 0);
    }



}








