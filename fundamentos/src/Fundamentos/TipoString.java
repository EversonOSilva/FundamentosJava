package Fundamentos;

import java.util.Locale;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(0));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;
        //Printando variaveis String
        System.out.println("Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: "
                + idade + "\nSalario: " + salario + "\n\n");


        //Criando uma variável maisUmaFrase concatenando
        // variaveis e printando somente uma variável String
        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: "+ idade + "\nSalario: "
                + salario + "\n\n";
        System.out.println(maisUmaFrase);


        //Printando com formatação
        System.out.printf("O senhor %s %s tem %d e ganha %.2f"
                , nome, sobrenome, idade, salario);


        //Criando formatação de concatenações dentro
        // de uma variável e printando somenta a variável "frase"
        String frase = String.format("\nO senhor %s %s tem %d e ganha %.2f"
                , nome, sobrenome, idade, salario);
        System.out.println(frase);

        //Funcionalidades do tipo String e notação do ponto "."
        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6,8));
    }
}
