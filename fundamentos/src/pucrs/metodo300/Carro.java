package pucrs.metodo300;

public class Carro extends Automovel{
    private String marca;
    private String modelo;

    public Carro(int anoFabricacao, int kmsRodados, String placa, String modelo, String marca) {
        super(anoFabricacao, kmsRodados, placa);
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
}
