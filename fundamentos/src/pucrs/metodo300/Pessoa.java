package pucrs.metodo300;

public class Pessoa {

    private String nome, endereco;
    private int idade;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String toString() {
        return nome +";"+ idade +";" + endereco+"\n";
    }

}
