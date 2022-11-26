package model;

import model.enuns.TipoProduto;

public class Jogo extends Produto{

    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo(String nome, Integer id, Double preco, TipoProduto tipoProduto, String distribuidora, String genero, String estudio) {
        super(nome, id, preco, tipoProduto);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + getNome() + '\'' +
                ", id='" + getId() + '\'' +
                ", preco='" + getPreco() + '\'' +
                ", tipoProduto=" + getTipoProduto() + '\'' +
                "distribuidora='" + distribuidora + '\'' +
                ", genero='" + genero + '\'' +
                ", estudio='" + estudio + '\'' +
                '}';
    }
}
