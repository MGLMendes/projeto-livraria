package model;

import model.enuns.TipoProduto;

public class Produto {
    private String nome;
    private Integer id;
    private Double preco;

    private TipoProduto tipoProduto;

    public Produto(String nome, Integer id, Double preco, TipoProduto tipoProduto) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", preco='" + preco + '\'' +
                ", tipoProduto=" + tipoProduto +
                '}';
    }
}
