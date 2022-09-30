package Fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        double num1 = in.nextDouble();
        System.out.print("Informe a operaçao: ");
        String op = in.next();
        System.out.print("Informe o numero: ");
        double num2 = in.nextDouble();


        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f",num1, op, num2, resultado);

        in.close();
    }
}
