package services;

import model.*;
import model.enuns.TipoProduto;
import repositories.EstoqueService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EstoqueController {

    private final EstoqueService<Produto> estoque;

    public EstoqueController(EstoqueService estoqueService) {
        this.estoque = estoqueService;
    }

    public void carregarEstoque() {

        Filme filme1 = new Filme("Harry Potter e a Pedra Filosofal", 1, 20.0, TipoProduto.FILMES, "Warner Bros", "David Yates", "Aventura", "Warner Bros");
        Filme filme2 = new Filme("Harry Potter e a Camara Secreta", 2, 20.0, TipoProduto.FILMES, "Warner Bros", "David Yates", "Aventura", "Warner Bros");

        Brinquedo hotweels = new Brinquedo("Hot Wheels", 2, 8.0, TipoProduto.BRINQUEDOS, "Carrinho de Brinquedo");

        estoque.addProduto(filme1);
        estoque.addProduto(filme2);
        estoque.addProduto(hotweels);

    }

    public void verProdutos(){
       this.estoque.verProdutos();
    }

    public void verProdutoEspecifico(TipoProduto tipoProduto){
        estoque.verProdutoEspecifico(tipoProduto);
    }
}
