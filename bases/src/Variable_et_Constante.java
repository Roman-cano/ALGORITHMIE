public class Variable_et_Constante {
    public static final double farConst =  9/5;
    public static final double kelConst = 273.15;
    public static final double rankineConst = 9/5;
    public static void main(String[] args) {



        // Variable
        double Cel =25;
        double far = (Cel * farConst) + 32;
        double kel = Cel + kelConst;
        double rankine = Cel * rankineConst + 491.67;
        System.out.println("Celsius: " + Cel + "°C");
        System.out.println("Fahrenheit: " + far + "°F");
        System.out.println("Kelvin: " + kel + "K");
        System.out.println("Rankine: " + rankine + "°R");


        // echanger les valeurs de deux variables
        int a = 5;
        int b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
