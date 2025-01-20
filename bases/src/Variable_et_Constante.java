public class Variable_et_Constante {
    public static final double farConst =  9/5;
    public static final double kelConst = 273.15;
    public static final double rankineConst = 9/5;
    public static final double pi = 3.14159;
    public static void main(String[] args) {
        // //////////////////////////////////////
        // variable type primitifs
        // //////////////////////////////////////


        // /////////////////
        // variable bite
        // ////////////////
        // Taille : 8 bits (1 octet) Plage : -128 à 127
        byte nbr1 = 127;
        byte NBR2 = -128;
        byte resultat = (byte) (nbr1 + NBR2);

        System.out.println("Byte: " + resultat);
        System.out.println("------------------------------");

        // /////////////////
        // variable Integer
        // ////////////////

        //Taille : 32 bits (4 octets) Plage : -2,147,483,648 à 2,147,483,647
        int integer =  34562;

        System.out.println("Integer: " + integer);
        System.out.println("------------------------------");

        // /////////////////
        // Variable Booléenne 1 bit
        // ////////////////
        boolean bool = true;
        boolean bool2 = false;

        boolean unChoc = true;
        boolean unCoup = true;
        boolean reponse = bool && bool2 || unChoc && unCoup;
        System.out.println("la réponse booléenne est: " + reponse);
        System.out.println("------------------------------");



        // /////////////////
        // Variable Char
        // ////////////////

        // Taille : 16 bits (2 octets) Plage : 0 à 65,535
        char lePremier = 'A';
        char leSecond = 65;

        System.out.println("lePremier: " + lePremier); //
        System.out.println("leSecond: " + leSecond);
        System.out.println("------------------------------");
        // le compilateur reconnait leSecond comme un caractère car 65 est un code ASCII


        // /////////////////
        // Variable Short
        // ////////////////

        // Taille : 16 bits (2 octets) Plage : -32,768 à 32,767
        short short1 = 32767;
        short short2 = -32768;
        short shortResultat = (short) (short1 + short2);
        System.out.println("Short: " + shortResultat);
        System.out.println("------------------------------");
        // /////////////////
        // Variable Long
        // ////////////////

        // Taille : 64 bits (8 octets) Plage : -9,223,372,036,854,775,808 à 9,223,372,036,854,775,807

        long long1 = 9223372036854775807L;
        long long2 = -9223372036854775808L;
        long longResultat = long1 + long2;
        System.out.println("Long: " + longResultat);
        System.out.println("------------------------------");
        // /////////////////
        // Variable Float
        // ////////////////

        // Taille : 32 bits (4 octets) Plage : 1.4e-045 à 3.4e+038
        float float1 = 3.4e+038f;
        float float2 = 1.4e-045f;
        float floatResultat = float1 + float2;

        System.out.println("Float: " + floatResultat);
        System.out.println("------------------------------");

        // /////////////////
        // Variable Double
        // ////////////////

        // Taille : 64 bits (8 octets) Plage : 4.9e-324 à 1.8e+308
        double double1 = 1.8e+307;
        double double2 = 4.9e-324;
        double doubleResultat = double1 + double2;

        System.out.println("Double: " + doubleResultat);
        System.out.println("------------------------------");


        // ///////////////////////////////////////
        // Convertir une température en Celsius
        // en Fahrenheit, Kelvin et Rankine
        // ///////////////////////////////////////
        // Variable


        double Cel =25;
        double far = (Cel * farConst) + 32;
        double kel = Cel + kelConst;
        double rankine = Cel * rankineConst + 491.67;
        System.out.println("Celsius: " + Cel + "°C");
        System.out.println("Fahrenheit: " + far + "°F");
        System.out.println("Kelvin: " + kel + "K");
        System.out.println("Rankine: " + rankine + "°R");

        // ///////////////////////////////////////
        // echanger les valeurs de deux variables
        // ///////////////////////////////////////

        int a = 5;
        int b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // ///////////////////////////////////////
        // Calculer le périmètre et l'aire d'un cercle
        // ///////////////////////////////////////

        int rayon = 5;
        double perimetre = 2 * pi * rayon;
        double aire = pi * rayon * rayon;

        System.out.println("Rayon: " + rayon);
        System.out.println("Périmètre: " + perimetre);


        // ///////////////////////////////////////
        // Conversion de devise
        // ///////////////////////////////////////

        int euro = 100;
        double usd = euro * 1.18;
        double gbp = euro * 0.86;
        System.out.println("Euro: " + euro);
        System.out.println("USD: " + usd);
        System.out.println("GBP: " + gbp);

    }

}
