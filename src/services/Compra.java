package services;

import model.Caixa;
import model.Cliente;
import model.Produto;
import model.RealizaCompra;
import repositories.EstoqueService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compra {

    private Caixa caixa;

    private Cliente cliente;

    private EstoqueService estoqueService;

    public Compra(Cliente cliente){
        this.cliente = cliente;
        estoqueService = new EstoqueService();
    }

    public void comprar(Integer idProduto, Double valor){
        Produto produto = estoqueService.getProdutoPorId(idProduto);
        double valorTotal = estoqueService.getValorTotalProdutos();

        Map<Boolean, Double> concedidoDescontoEValorTotal = RealizaCompra.dignoDeDesconto(produto, valorTotal);

        if (concedidoDescontoEValorTotal.get(true) > valor) {
            System.out.println("Valor de pagamento insuficiente");
        } else {
            if (RealizaCompra.possoRealizarACompra(cliente, produto.getParaAdultos())) {
                estoqueService.getProdutoPorId(idProduto);
                caixa.adicionarEntrada(concedidoDescontoEValorTotal.get(true));
            }
        }


    }
}
