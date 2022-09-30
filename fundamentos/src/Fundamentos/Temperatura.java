package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final double AJUSTE = 32;
        final double FATOR = 5/9.0;

        double farenheit = 95;
        double celcius = (farenheit - AJUSTE)*FATOR;

        System.out.println("O resultado e: "+ celcius+ "");

    }
}
