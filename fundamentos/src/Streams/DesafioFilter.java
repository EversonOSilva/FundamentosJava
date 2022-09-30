package Streams;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {


        Produtos p1 = new Produtos("Caneta", 2.99, 12.90, 0.25);
        Produtos p2 = new Produtos("Lapis", 2.99, 5.30, 0.12);
        Produtos p3 = new Produtos("Notebook", 0.0, 4870.90, 0.50);
        Produtos p4 = new Produtos("Caderno", 5.99, 15.80, 0.15);
        Produtos p5 = new Produtos("Cola", 7.99, 7.99, 0.5);
        Produtos p6 = new Produtos("Lapizeira", 25.99, 40.60, 0.17);
        Produtos p7 = new Produtos("Monitor", 0.0, 800.99, 0.31);
        Produtos p8 = new Produtos("Mochila", 7.99, 185.90, 0.18);
        Produtos p9 = new Produtos("Cadeira Gamer", 0.0, 5870.10, 0.50);


        List<Produtos> produto = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);

        // Filter, Filter, Filter, Map
        Predicate<Produtos> SuperDesc = p -> p.desconto >= 0.0;
        Predicate<Produtos> freteGratis = p -> p.valorFrete >= 0;
        Predicate<Produtos> produtoRelevante = p -> p.preco >= 0;

        Function<Produtos, String> chamadaPromocional = p -> "Aproveite! " +p.nome+ " por R$" +p.preco;
      produto.stream()
              .filter(SuperDesc)
              .filter(freteGratis)
              .filter(produtoRelevante)
              .map(chamadaPromocional)
              .forEach(System.out::println);

    }
}
