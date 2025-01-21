public class Condition {
    public static void main(String[] args) {
        // //////////////////////////////////////
        // Structure conditionlle
        // //////////////////////////////////////


        // /////////////////
        // vérifier si un nombre est pair ou impair
        // ////////////////

        int nombre = 5;
        if (nombre % 2 == 0) {
            System.out.println("Le nombre est pair");
        } else {
            System.out.println("Le nombre est impair");
        }

        System.out.println("------------------------------");

        // /////////////////
        // vérifier si un nombre est positif ou négatif
        // ////////////////

        int nbr = -5;
        if (nbr > 0) {
            System.out.println("Le nombre est positif");
        } else {
            System.out.println("Le nombre est négatif");
        }

        System.out.println("------------------------------");

        // /////////////////
        // comparaison de 3 nombres
        // ////////////////

        int nbr1 = 5;
        int nbr2 = 10;
        int nbr3 = 15;

        if(nbr1 == nbr2 && nbr1 == nbr3) {
            System.out.println("les 3 nombres sont égaux");
        }
        else if(nbr1 == nbr2 || nbr2 == nbr3 || nbr1 == nbr3) {
            System.out.println("2 nombres sont égaux");
        }
        else {
            System.out.println("les 3 nombres sont différents");

        }

        System.out.println("------------------------------");


        // /////////////////
        // identification type quadrylatère
        // ////////////////

        int cote1 = 5;
        int cote2 = 5;
        int cote3 = 5;
        int cote4 = 5;

        if(cote1 == cote2 && cote1 == cote3 && cote1 == cote4) {
            System.out.println("C'est un carré");
        }
        else if(cote1 == cote3 && cote2 == cote4) {
            System.out.println("C'est un rectangle");
        }
        else {
            System.out.println("C'est un quadrylatère");
        }

        System.out.println("------------------------------");


        // /////////////////
        // Calculateur de réduction
        // ////////////////

        double prix = 100;
        String type = "etudiant";

        switch (type) {
            case "etudiant":
                prix = prix - (prix * 0.1);
                break;
            case "senor":
                prix = prix - (prix * 0.2);
                break;
            case "famille":
                prix = prix - (prix * 0.05);
                break;
            default:
                System.out.println("Type non reconnu");
        }

        System.out.println("Le prix final est: " + prix);


    }
}
