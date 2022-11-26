package model;

import model.enuns.TipoProduto;

public class Filme extends Produto {

    private String estudio;
    private String diretores;
    private String genero;
    private String produtores;



    public Filme(String nome, Integer id, Double preco, TipoProduto tipoProduto, String estudio, String diretores, String genero, String produtores) {
        super(nome, id, preco, tipoProduto);
        this.estudio = estudio;
        this.diretores = diretores;
        this.genero = genero;
        this.produtores = produtores;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getDiretores() {
        return diretores;
    }

    public void setDiretores(String diretores) {
        this.diretores = diretores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutores() {
        return produtores;
    }

    public void setProdutores(String produtores) {
        this.produtores = produtores;
    }


    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + getNome() + '\'' +
                ", id='" + getId() + '\'' +
                ", preco='" + getPreco() + '\'' +
                ", tipoProduto=" + getTipoProduto() + '\'' +
                "estudio='" + estudio + '\'' +
                ", diretores='" + diretores + '\'' +
                ", genero='" + genero + '\'' +
                ", produtores='" + produtores + '\'' +
                '}';
    }
}
