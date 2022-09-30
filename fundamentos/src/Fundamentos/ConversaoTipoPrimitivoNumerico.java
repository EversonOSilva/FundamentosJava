package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a =1;// implicita
        System.out.println(a);

        float b = (float) 1.123458888888; //Explicita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; //Explicita (CAST)

        System.out.println(d);

        double e = 1.999999999999999;
        int f = (int) e;
        System.out.println(f);
    }
}
