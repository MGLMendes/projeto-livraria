package services;

import model.Produto;
import model.enuns.TipoProduto;

import java.util.List;

public interface InterfaceEstoque<T extends Produto> {

    List<T> getProdutos();

    T getProdutoPorId(int id);

    void addProduto(T produto);

    boolean deleteProduto(T produto);

    boolean deletarProdutoPorId(Integer id);

    void alterarProduto(T produto);

    void verProdutos();

    void verProdutoEspecifico(TipoProduto tipoProduto);
}
