package Fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {

        String s = new String("texto");
        s.toUpperCase();

        //Fundamentos.Wrappers são a versão objeto dos tipos primitivos!
        int a = 123;
        System.out.println(a);

    }
}
