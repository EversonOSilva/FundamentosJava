package Excessao.PersonalizadaB;


@SuppressWarnings("Serial")
public class NumeroForaIntervaloException extends Exception {

    private String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' esta negativo", nomeDoAtributo);

    }
}
