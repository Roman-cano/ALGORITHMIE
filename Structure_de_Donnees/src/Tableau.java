import java.util.ArrayList;
import java.util.List;

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


        System.out.println("-----------------------------");

        // Exercice
        int[] recipe = {2, 1, 3};
        int[] available = {4, 2, 6};
        System.out.println(cakes(recipe, available)); // 2

        System.out.println("-----------------------------");

        // Exercice

        long[] result = findEmirp(50);
        for (long i : result) {
            System.out.println(i);
        }


        System.out.println("-----------------------------");

        // Exercice


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

    public static int cakes(int recipe[], int available[]) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < recipe.length; i++) {
            if (available[i] == 0) {
                return 0;
            }
            max = Math.min(max, available[i] / recipe[i]);
        }
        return max;
    }



    public static long[] findEmirp(long n) {
        List<Integer> count = new ArrayList<>();
        for (int i = 10; i <= n; i++) {
            if (!checkPalindrome(i)) {  // Vérifie si ce n'est pas un palindrome
                int reversed = reverse(i);
                if (checkPremier(i) && checkPremier(reversed) && i != reversed) {
                    count.add(i);
                }
            }
        }
        return count.stream().mapToLong(i -> i).toArray();
    }

    public static int reverse(int n) {
        String str = String.valueOf(n);
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        return Integer.parseInt(reversedStr.toString());
    }

    public static boolean checkPremier(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(int n) {
        return n == reverse(n);
    }



}
