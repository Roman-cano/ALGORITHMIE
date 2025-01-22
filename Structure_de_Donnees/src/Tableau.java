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

        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i]);
        }

        System.out.println("-----------------------------");
        //
        int[] tab = {1, 2, 3, 4, 5};
        int resultat = 0;
        for (int i = 0; i < tab.length; i++) {
           if (estPair(tab[i])) {
               resultat += tab[i];
           }
        }
        System.out.println(resultat);

        System.out.println("-----------------------------");

        // Exercice

        int[] tab2 = {1, 2, 3, 4, 5};
        afficheTab(tab2);

// Stocker le dernier élément
        int last = tab2[tab2.length - 1];

// Décaler tous les éléments vers la droite
        for (int i = tab2.length - 1; i > 0; i--) {
            tab2[i] = tab2[i - 1];
        }

// Placer le dernier élément en première position
        tab2[0] = last;

    

        afficheTab(tab2);


        System.out.println("-----------------------------");


        int[][] tab3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        affichageMatrice(tab3);

    }






    public static boolean estPair(int n) {
       return n%2 == 0;
    }

    public static void afficheTab(int[] tab) {
        System.out.print("Affichage du tableau ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
        }
        System.out.println("");
    }

    public static void affichageMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
