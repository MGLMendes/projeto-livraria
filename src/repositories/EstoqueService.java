package repositories;

import model.*;
import model.enuns.TipoProduto;
import services.InterfaceEstoque;

import java.util.ArrayList;
import java.util.List;

public class EstoqueService<T extends Produto> implements InterfaceEstoque<T> {

    private List<AlbumMusica> estoqueAlbumDeMusica = new ArrayList<>();
    private List<Filme> estoqueFilme = new ArrayList<>();
    private List<Livro> estoqueLivro = new ArrayList<>();
    private List<Jogo> estoqueJogo = new ArrayList<>();
    private List<Brinquedo> estoqueBrinquedo = new ArrayList<>();
    private List<T> produtos;

    public EstoqueService() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public List<T> getProdutos() {
        return produtos;
    }

    @Override
    public T getProdutoPorId(int id) {

        for(T produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }



    @Override
    public void addProduto(T produto) {
        produtos.add(produto);
    }

    @Override
    public boolean deleteProduto(T produto) {
        return produtos.remove(produto);
    }

    @Override
    public boolean deletarProdutoPorId(Integer id) {
        boolean produtoDeletado = false;
        for (T produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove(produto);
                produtoDeletado = true;
                return produtoDeletado;
            }
        }
        return produtoDeletado;
    }

    @Override
    public void alterarProduto(T produto) {
        for(T t : produtos){
            if (t.getId() == produto.getId()){
                deleteProduto(t);
                addProduto(produto);
            }
        }
    }

    @Override
    public void verProdutos() {
        produtos.forEach(
                System.out::println
        );
    }

    @Override
    public double getValorTotalProdutos() {
        int valorTotal = 0;
        for (T produto : produtos) {
            valorTotal += produto.getPreco();
        }

        return valorTotal;
    }

    @Override
    public void verProdutoEspecifico(TipoProduto tipoProduto) {
        produtos.forEach(
                produto -> {
                    if (produto.getTipoProduto().equals(TipoProduto.ALBUNS_MUSICA)){
                        estoqueAlbumDeMusica.add((AlbumMusica) produto);
                        estoqueAlbumDeMusica.forEach(System.out::println);
                    } else if (produto.getTipoProduto().equals(TipoProduto.BRINQUEDOS)){
                        estoqueBrinquedo.add((Brinquedo) produto);
                        estoqueBrinquedo.forEach(System.out::println);
                    }  else if (produto.getTipoProduto().equals(TipoProduto.FILMES)){
                        estoqueFilme.add((Filme) produto);
                        estoqueFilme.forEach(System.out::println);
                    }  else if (produto.getTipoProduto().equals(TipoProduto.LIVROS)){
                        estoqueLivro.add((Livro) produto);
                        estoqueLivro.forEach(System.out::println);
                    } else {
                        estoqueJogo.add((Jogo) produto);
                        estoqueJogo.forEach(System.out::println);
                    }
                }
        );
    }


}
