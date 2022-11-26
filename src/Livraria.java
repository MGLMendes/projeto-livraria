import model.Produto;
import model.enuns.TipoProduto;
import repositories.EstoqueService;
import services.Compra;
import services.EstoqueController;

import java.util.List;


public class Livraria {
    public static void main(String[] args) {
        EstoqueService estoqueService = new EstoqueService();
        EstoqueController estoque = new EstoqueController(estoqueService);
        estoque.carregarEstoque();


        estoque.verProdutoEspecifico(TipoProduto.LIVROS);

        Compra compra = new Compra();
        compra.comprar(1, 50.0);
    }
}
