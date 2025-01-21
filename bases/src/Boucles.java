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

        int nombre = 10;
        for (int i = 0; i < nombre; i++) {
            for (int j = 0; j < nombre; j++) {
                System.out.print("j");
            }
            System.out.println("");
        }
    }
}
