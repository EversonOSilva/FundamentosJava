package Fundamentos.Operadores;

public class DesafioOperadoresAritimeticos {
    public static void main(String[] args) {
        double a = 6*(3+2);
        double b = Math.pow(a,2);
        double c = b / (3*2);
        double d = (1-5)*(2-7) / 2;
        double e = Math.pow(d,2);
        double f = Math.pow((c - e),3);
        double g = f / (Math.pow(10,3));
        System.out.println(g);
    }
}

