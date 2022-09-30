package pucrs.metodo300;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploArquivoTexto {

    public static void main(String[] args) {

        Path path = Paths.get("Texto.txt");
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(path, Charset.defaultCharset()))){
            pw.println("Escrevendo linha em arquivo texto ...");
            pw.println("Outra linha...");
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
