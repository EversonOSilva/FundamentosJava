package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrayFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informa a quantidade de notas: ");
        int quant = in.nextInt();

        double[] notas = new double[quant];

        for ( int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = in.nextDouble();
        }
        double total = 0;
        for(double nota: notas) {
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("A media é: " + media + "!");
        in.close();






        /**int i;
        double soma = 0;
        for (i = 1; i <= notas.length; i++) {
            System.out.print("Informe a " + i + "ª nota: ");
            notas[i-1] = in.nextDouble();
            soma = soma + notas[i];
        }
        double media = soma / quant;
        System.out.println(media);**/
    }

}
