package Fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro Texto";
        System.out.println(c);

        // c = 4.5; dá erro porque variável já foi inferida como String

        double d; // variável declarada
        d = 123.65; // variável inicializada
        System.out.println(d); //usada

        var e = 123.45;
        System.out.println(e);

        var f = 12; //inteiro
        //f = 12,01; erro porque variável já foi declarada como inteira na inferencia

    }
}
