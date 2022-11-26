package model;

import model.enuns.TipoProduto;

public class AlbumMusica extends Produto {
    private String musicosBanda;
    private String generos;
    private String selos;

    public AlbumMusica(String nome, Integer id, Double preco, TipoProduto tipoProduto, String musicosBanda, String generos, String selos) {
        super(nome, id, preco, tipoProduto);
        this.musicosBanda = musicosBanda;
        this.generos = generos;
        this.selos = selos;
    }

    public String getMusicosBanda() {
        return musicosBanda;
    }

    public void setMusicosBanda(String musicosBanda) {
        this.musicosBanda = musicosBanda;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getSelos() {
        return selos;
    }

    public void setSelos(String selos) {
        this.selos = selos;
    }

    @Override
    public String toString() {
        return "AlbumMusica{" +
                "nome='" + getNome() + '\'' +
                ", id='" + getId() + '\'' +
                ", preco='" + getPreco() + '\'' +
                ", tipoProduto=" + getTipoProduto() + '\'' +
                "musicosBanda='" + musicosBanda + '\'' +
                ", generos='" + generos + '\'' +
                ", selos='" + selos + '\'' +
                '}';
    }
}
