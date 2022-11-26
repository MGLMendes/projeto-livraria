package model;

import model.enuns.TipoProduto;

import java.util.HashMap;
import java.util.Map;

public class RealizaCompra {

    public static boolean possoRealizarACompra(Cliente cliente, boolean filmeAdulto){
        if (filmeAdulto) {
            if (cliente.isAdult()){
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static Map<Boolean, Double> dignoDeDesconto(Produto produto, double valorTotal) {
        Map<Boolean, Double> consedidoDescontoEValorTotal = new HashMap<>();
        boolean consedidoDesconto = false;
        if (produto.getTipoProduto().equals(TipoProduto.LIVROS)
        && valorTotal > 200.0){
            consedidoDesconto = true;
            valorTotal =  concederDesconto(valorTotal);
            consedidoDescontoEValorTotal.put(consedidoDesconto, valorTotal);
            return consedidoDescontoEValorTotal;
        }
        consedidoDescontoEValorTotal.put(consedidoDesconto, valorTotal);
        return consedidoDescontoEValorTotal;
    }

    private static Double concederDesconto(double valorTotal) {
        return valorTotal - valorTotal * 0.15;
    }
}
