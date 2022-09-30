package pucrs.metodo300;

public class Automovel {
    private int anoFabricacao;
    protected int kmsRodados;
    private String placa;
    public Automovel(int anoFabricacao, int kmsRodados, String placa) {
        this.anoFabricacao = anoFabricacao;
        this.kmsRodados = kmsRodados;
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getKmsRodados() {
    return kmsRodados;
    }

    public String getPlaca() {
    return placa;
}
}