package Fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("-----Media Salarial-----");

        System.out.print("Digite sal 1: ");
        String sal1 = in.next().replace(",", ".");
        System.out.print("Digite sal 2: ");
        String sal2 = in.next().replace(",", ".");
        System.out.print("Digite sal 3: ");
        String sal3 = in.next().replace(",", ".");

        System.out.println("Salario 1: " + sal1 + "\nSalario 2: "
                + sal2 + "\nSalario 3: " +sal3);

        double val1 = Double.parseDouble(sal1);
        double val2 = Double.parseDouble(sal2);
        double val3 = Double.parseDouble(sal3);
        double soma = val1 + val2 + val3;

        System.out.println("Soma dos 3 ultimos salarios e = " + soma);
        System.out.println("Media dos 3 ultimos salatios e = " + soma / 3);

        in.close();
    }
}
