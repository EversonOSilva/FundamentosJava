package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila { //First in First out FIFO

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!

        fila.add("Ana"); // retorna false
        fila.offer("Bia"); //Lança uma excessão
        fila.add("Carlos");
        fila.add("Daniel");
        fila.offer("Rafaela");
        fila.add("Gui");

        //Peak e Element -> obter o proximo elemento sem remover
        //Diferença é o comportamento ocorre
        //quando a fila está vazia
        System.out.println(fila.peek());//Retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element());// Lanca uma excessão
        System.out.println(fila.element());
        //fila.size();
        //fila.clear();
        //fila.isEmpty();

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());


       //fila.contains(...);



    }
}
