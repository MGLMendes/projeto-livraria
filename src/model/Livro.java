package model;

import model.enuns.TipoProduto;

public class Livro extends Produto {

    private String genero;
    private String escritor;
    private String editora;

    private boolean publicoAdulto = false;

    public Livro(String nome, Integer id, Double preco, TipoProduto tipoProduto, String genero, String escritor, String editora) {
        super(nome, id, preco, tipoProduto);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
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
        return "Livro{" +
                "nome='" + getNome() + '\'' +
                ", id='" + getId() + '\'' +
                ", preco='" + getPreco() + '\'' +
                ", tipoProduto=" + getTipoProduto() + '\'' +
                "genero='" + genero + '\'' +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
