package Controle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quant = 0;
        double nota = 0;
        double total = 0;

        while(nota !=-1){
            System.out.print("Informe a nota (ou -1 p/ sair): ");
            nota = in.nextDouble();
            if(nota <= 10 && nota >= 0){

                total += nota;
                quant++;
            } else if (nota != -1) {
                System.out.println("Nota Inválida!!! ;D");
            }
        }
        //Calcular a media
        double media = total / quant;
        System.out.printf("Media = %.2f", media);
        in.close();
    }
}