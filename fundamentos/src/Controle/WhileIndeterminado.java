package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String d = "";



        while (!d.equalsIgnoreCase("sair")) {
            System.out.print("Ola: ");
            d = in.nextLine();
        }
    }
}
