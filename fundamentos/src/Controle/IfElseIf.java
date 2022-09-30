package Controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma notade 0 a 10: ");

        double nota = in.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota invalida!");
        } else
            if (nota>=8.1) {
                System.out.println("Conceito A");
            }


        in.close();
    }
}

