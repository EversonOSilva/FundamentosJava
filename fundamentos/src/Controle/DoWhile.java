package Controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //if(...) sentença de codigo; ou um bloco de codigo{}
        //while (...) sentença; ou {}
        //for(..;..;..) sentença ou {}
        //do sentença; ou {} while(...);

        Scanner in = new Scanner(System.in);

        String texto = "";
        do {
            System.out.println("Voce precisa falar as " +
                    "palavras magias");
            System.out.print("Quer sair? ");
            texto = in.nextLine();
        }while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");
        in.close();
    }
}
