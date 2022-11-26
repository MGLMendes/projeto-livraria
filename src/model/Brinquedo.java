package model;

import model.enuns.TipoProduto;

public class Brinquedo extends Produto{

    private String tipo;

    private boolean publicoAdulto = false;

    public Brinquedo(String nome, Integer id, Double preco, TipoProduto tipoProduto, String tipo) {
        super(nome, id, preco, tipoProduto);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void paraAdultos(boolean paraAdultos){
        if (paraAdultos) {
            publicoAdulto = true;
        }
    }

    public boolean getParaAdultos(){
        return this.publicoAdulto;
    }

    @Override
    public String toString() {
        return "Brinquedo{" +
                "nome='" + getNome() + '\'' +
                ", id='" + getId() + '\'' +
                ", preco='" + getPreco() + '\'' +
                ", tipoProduto=" + getTipoProduto() + '\'' +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
