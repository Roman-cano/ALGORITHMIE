public class Tableau {
    public static void main(String[] args) {

        // //////////////////////////
        // les Structures de données/
        // //////////////////////////

        // Les tableaux
        // Un tableau est une structure de données qui permet de stocker plusieurs valeurs de même type.
        // Chaque valeur est accessible par un indice.
        // La taille d'un tableau est fixée lors de sa création.
        // La syntaxe pour déclarer un tableau est la suivante :
        // type[] nomTableau = new type[taille];

        System.out.println("Hello, World!");

        //
        int[] tab = {1, 2, 3, 4, 5};
        int resultat = 0;
        for (int i = 0; i < tab.length; i++) {
           if (estPair(tab[i])) {
               resultat += tab[i];
           }
        }
        System.out.println(resultat);


        // Exercice

    }


    public static boolean estPair(int n) {
       return n%2 == 0;
    }
}
