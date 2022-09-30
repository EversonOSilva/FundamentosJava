package pucrs.metodo300;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {

        Pessoa[] lista = new Pessoa[3];
        lista[0] = new Pessoa("Maria", 22,"Porto Alegre");
        lista[1] = new Pessoa("Pedro", 21,"Caxias");
        lista[2] = new Pessoa("Mario", 23,"Alegrete");

        Path path = Paths.get("Pessoas.csv");

        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, Charset.defaultCharset()))){

            for (Pessoa p : lista) {
                String nome = p.getNome();
                String endereco = p.getEndereco();
                int idade = p.getIdade();
                writer.format("%s;%d;%s%n",nome,idade,endereco);
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
