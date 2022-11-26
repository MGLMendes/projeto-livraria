package model;

public class Caixa {
    private static Double valor;

    public Caixa() {
        Caixa.valor = Double.valueOf(0);
    }

    public static Double getValor() {
        return valor;
    }

    public static void setValor(Double valor) {
        Caixa.valor = valor;
    }

    public void adicionarEntrada(Double valorDaCompra){
        valor += valorDaCompra;
    }

    

}
