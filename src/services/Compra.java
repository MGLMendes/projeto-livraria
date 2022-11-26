package services;

import model.Caixa;
import model.Produto;
import repositories.EstoqueService;

import java.util.List;

public class Compra {

    private Caixa caixa;

    private EstoqueService estoqueService;

    public Compra(){
        estoqueService = new EstoqueService();
    }

    public void comprar(Integer idProduto, Double valor){
        Produto produto = estoqueService.getProdutoPorId(idProduto);

        if (produto.getPreco() > valor) {
            System.out.println("Valor de pagamento insuficiente");
        } else {
            estoqueService.getProdutoPorId(idProduto);
            caixa.adicionarEntrada(valor);
        }


    }
}
