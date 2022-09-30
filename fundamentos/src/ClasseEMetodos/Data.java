package ClasseEMetodos;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
        //this(1, 1, 1970); pode ser usado também
        // usando o this para puxar os parâmetros do
        // segundo construtor
    }

    Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada(){
        String formato = "Data: %d/%d/%d";
        return String.format(formato, dia,  mes,  ano);
    }
    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }

}
