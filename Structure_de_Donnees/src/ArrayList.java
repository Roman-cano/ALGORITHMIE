public class ArrayList {
    public static void Main(String[] args) {
        // Initialisation
        int n = 7; // Nombre de personnes
        int k = 3; // Pas de saut

        // Appel de la fonction
        int resultat = josephusSurvivor(n, k);

        // Affichage du résultat
        System.out.println("Le survivant est : " + resultat);

    }

    public static int josephusSurvivor(int n, int k) {
        // Initialisation
        int current = 0; // Index actuel
        java.util.ArrayList<Integer> liste = new java.util.ArrayList<>();

        // Remplir la liste avec des valeurs de 1 à n
        for (int i = 1; i <= n; i++) {
            liste.add(i);
        }

        // Répéter jusqu'à ce qu'il reste un seul élément
        while (liste.size() > 1) {
            // Calculer l'index de l'élément à supprimer
            current = (current + k - 1) % liste.size();
            liste.remove(current); // Supprimer l'élément
        }

        // Retourner l'élément restant
        return liste.get(0);
    }
}
