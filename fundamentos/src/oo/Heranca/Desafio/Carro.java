package oo.Heranca.Desafio;

public class Carro {
    public int velocidadeAtual;

    public boolean acelerar() {
        velocidadeAtual += 5;
        return true;
    }

    public boolean frear() {
        velocidadeAtual -= 5;
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidadeAtual=" + velocidadeAtual +
                '}';
    }
}
