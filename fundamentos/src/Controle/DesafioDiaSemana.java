package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");

        String dia = in.next();

        if (dia.equalsIgnoreCase("Domingo")) {
            System.out.println("Dia da semana (1)");
        } else if (dia.equalsIgnoreCase("Segunda")) {
            System.out.println("Dia da semana (2)");
        } else if (dia.equalsIgnoreCase("Terca")) {
            System.out.println("Dia da semana (3)");
        } else if (dia.equalsIgnoreCase("Quarta")) {
            System.out.println("Dia da semana (4)");
        } else if (dia.equalsIgnoreCase("Quinta")) {
            System.out.println("Dia da semana (5)");
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("Dia da semana (6)");
        } else if (dia.equalsIgnoreCase("Sabado")) {
            System.out.println("Dia da semana (7)");
        } else {
            System.out.println("Dia da semana invalido!!!");
        }
        System.out.println("\n\n FIM!!!");
    }
}
