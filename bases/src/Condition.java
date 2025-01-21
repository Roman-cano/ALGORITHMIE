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


        System.out.println("------------------------------");
        // /////////////////
        // convertisseur note
        // ////////////////
        int note = 95;
        char grade;

       if(note >= 90) {
           grade = 'A';
       }
       else if(note >= 80) {
           grade = 'B';
       }
       else if(note >= 70) {
           grade = 'C';
       }
       else if(note >= 60) {
           grade = 'D';
       }
       else {
           grade = 'F';
       }

        System.out.println("La note est: " + grade);

        System.out.println("------------------------------");

        // /////////////////
        // calcul prime salariale
        // ////////////////

        int anciennete = 5;
        double prime = 0;
        double salaire = 2300;

        if(anciennete >= 5) {
            prime = salaire * 0.1;
            System.out.println("Le salaire est: " + prime);
        }
        else if(salaire >= 2) {
            prime =  salaire * 0.05;
            System.out.println("Le salaire est: " + prime);
        }
        else {
            System.out.println("Pas de prime salariale");
        }
        System.out.println("le salaire est:" + (salaire + prime));
    }
}
