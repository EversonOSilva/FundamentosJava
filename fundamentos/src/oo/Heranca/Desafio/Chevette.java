package oo.Heranca.Desafio;

public class Chevette extends Carro implements Esportivo {

   public  boolean acelerar() {
        boolean acelerar1 = super.acelerar();
        boolean acelerar2 = super.acelerar();
        boolean acelerar3 = super.acelerar();
        return acelerar1 || acelerar2 || acelerar3;
    }

    @Override
    public void ligarTurbo() {

    }

    @Override
    public void desligarTurbo() {

    }
}
