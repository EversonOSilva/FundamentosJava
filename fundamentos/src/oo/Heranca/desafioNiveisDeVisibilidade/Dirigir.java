package oo.Heranca.desafioNiveisDeVisibilidade;

import oo.Heranca.Desafio.Chevette;
import oo.Heranca.Desafio.Fusca;

public class Dirigir {

    public static void main(String[] args) {

        Fusca f1 = new Fusca();
        Chevette c1 = new Chevette();

        f1.velocidadeAtual = 100;
        c1.velocidadeAtual = 100;


        System.out.println(f1.toString());
        System.out.println(c1.toString());

        f1.acelerar();
        c1.acelerar();
        f1.acelerar();
        c1.acelerar();
        f1.acelerar();
        c1.acelerar();

        System.out.println(f1.toString());
        System.out.println(c1.toString());

        c1.frear();
        c1.frear();
        f1.frear();
        f1.frear();

        System.out.println(f1.toString());
        System.out.println(c1.toString());
    }
}
